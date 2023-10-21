package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		String src=driver.getPageSource();
		String exp="Search";
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
