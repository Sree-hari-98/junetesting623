package pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	ChromeDriver driver;
	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/Alertbox.html");
	}
	@Test
	public void Buttonverify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		if(actualtext.equals("Hello! I am an Alert Box!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
		
	}

}
