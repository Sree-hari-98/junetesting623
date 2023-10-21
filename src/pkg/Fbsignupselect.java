package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbsignupselect {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1="
				+ "s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword="
				+ "fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%"
				+ "3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%"
				+ "3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%"
				+ "26loc_physical_ms%3D9040212%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&"
				+ "gclid=EAIaIQobChMInfvwsNy4gQMVDm19Ch1NsA3KEAAYASAAEgJRjfD_BwE");	
		}
	@Test
	public void ButtonTest()
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("23");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select M=new Select(month);
		M.selectByIndex(8);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select Y=new Select(year);
		Y.selectByVisibleText("1998");
		
		List<WebElement> li = day.getOptions();
		System.out.println(li.size());
		List<WebElement> li1 = M.getOptions();
		System.out.println(li1.size());
		List<WebElement> li2 = Y.getOptions();
		System.out.println(li2.size());
		
	}

}
