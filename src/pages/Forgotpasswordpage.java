package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotpasswordpage {
	WebDriver driver;
	By forgottenlink=By.xpath("//a[contains(text(),'Forgotten password?')]");
	By forgottenpasswordmobile=By.xpath("//input[@id='identify_email']");
	By forgottenpswrdsearch=By.name("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
	}
	public Forgotpasswordpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgottenpasswordmobile).sendKeys(mobilenumber);
	}
	public void click()
	{
		driver.findElement(forgottenpswrdsearch).click();
	}

}
