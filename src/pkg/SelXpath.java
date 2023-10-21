package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void login() {
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123@abc");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
	}



}
