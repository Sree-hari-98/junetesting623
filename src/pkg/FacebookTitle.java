package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String src=driver.getTitle();
		String exp="Facebook";
		if(src.contains(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
