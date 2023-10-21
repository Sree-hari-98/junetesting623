package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragnDrop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Test
	public void drgndrp()
	{
		Actions act=new Actions(driver);
		WebElement drgbox=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drpbox=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(drgbox, drpbox);
		act.perform();
		String s=drpbox.getText();
		if(s.equals("Dropped!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	

}
