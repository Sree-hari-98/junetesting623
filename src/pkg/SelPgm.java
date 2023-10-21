package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelPgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.get("https://www.facebook.com");
	}
	@Test
	public void login() {
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.id("email")).sendKeys("9048751244");
		//driver.findElement(By.name("pass")).sendKeys("Sree@1244");
		//driver.findElement(By.name("login")).click();
		
	}
	

}
