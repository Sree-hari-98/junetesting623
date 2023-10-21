package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;
import pages.Forgotpasswordpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin() throws Exception
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abcd");
		ob.login();
		
		Forgotpasswordpage ob1=new Forgotpasswordpage(driver);
		ob1.linkclick();
		ob1.setvalues("abc");
		ob1.click();
	}

}
