 package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void window()
	{
		String ParentWindow=driver.getWindowHandle();
		System.out.println("Parent Window Title "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(ParentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@123mail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			driver.switchTo().window(ParentWindow);
			}
		//New Tab
		WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		
		//New Window
		WebDriver driver2=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");
		driver2.get("https://www.google.com");
	}
	

}
