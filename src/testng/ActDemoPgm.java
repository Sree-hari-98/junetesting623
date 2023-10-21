package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActDemoPgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(button).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		WebElement dblclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dblclk).perform();
		Alert b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();	
	}
}
