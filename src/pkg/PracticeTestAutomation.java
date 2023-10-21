package pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestAutomation {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File("D:\\Testlogin.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1; i<=sh.getLastRowNum(); i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username : "+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.id("submit")).click();
			
			String title=driver.getTitle();
			System.out.println(title);
			String exptitle="Logged In Successfully";
			if(title.contains(exptitle))
			{
				System.out.println("Passed");
			}
			else
			{
				System.out.println("Failed");
			}		
		}
	}
}
