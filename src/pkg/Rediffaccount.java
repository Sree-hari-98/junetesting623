package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffaccount {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void redifftest()
	{
		//WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		//String s=button.getAttribute("value");
		//if(s.equals("Create my account >>"))
		//{
		//	System.out.println("Pass");
		//}
		//else
		//{
		//	System.out.println("Fail");
		//}
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		Boolean check=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(check)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		Boolean gender=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(gender)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}

}
