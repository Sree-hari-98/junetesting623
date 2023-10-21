package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String a=driver.getPageSource();
		String b="Gmail";
		if(a.contains(b))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
