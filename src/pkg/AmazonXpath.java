package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void Testing()
	{
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("random@abcmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
		
}
}
