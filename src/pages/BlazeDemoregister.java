package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeDemoregister {
	WebDriver driver;
	By bldname=By.id("name");
	By bldcompany=By.id("company");
	By bldemail=By.id("email");
	By bldpswrd=By.id("password");
	By bldcfpswrd=By.id("password-confirm");
	By bldregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public BlazeDemoregister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name, String company, String email, String password, String cfpassword)
	{
		driver.findElement(bldname).sendKeys(name);
		driver.findElement(bldcompany).sendKeys(company);
		driver.findElement(bldemail).sendKeys(email);
		driver.findElement(bldpswrd).sendKeys(password);
		driver.findElement(bldcfpswrd).sendKeys(cfpassword);
	}
	public void register()
	{
		driver.findElement(bldregister).click();
	}

}
