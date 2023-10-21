package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		String src=driver.getTitle();
		String exp="amazon.in";
		if(src.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
