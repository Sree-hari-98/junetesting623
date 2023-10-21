package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BlazeDemoregister;

public class BlazeDemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testregister() throws Exception
	{
		BlazeDemoregister ob= new BlazeDemoregister(driver);
		ob.setvalues("sreehari", "company", "abc@gmail.com", "abc@123", "abc@123");
		ob.register();
	}

}
