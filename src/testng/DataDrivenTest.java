package testng;

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

public class DataDrivenTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File("D:\\Data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1; i<=sh.getLastRowNum(); i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username : "+username);
			String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pswrd);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswrd);
			driver.findElement(By.name("login")).click();
			
			String acturl=driver.getCurrentUrl();
			System.out.println(acturl);
			String expurl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1647001";
			if(acturl.equals(expurl))
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
