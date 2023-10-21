package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitgoogle {
	ChromeDriver driver = new ChromeDriver();
	@Before
	public void browseropen()
	{
		driver.get("https://www.google.com");
	}
	@Test
	public void title()
	{
		String src=driver.getTitle();
		String exp="Google";
		if(src.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void content()
	{
		String s=driver.getPageSource();
		String e="Gmail";
		if(s.contains(e))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@After
	public void browserclose()
	{
		driver.close();
	}

}
