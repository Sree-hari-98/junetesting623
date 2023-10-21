package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.FbPage;
import utilities.Excelutil;

public class FbTest extends BaseClass {
	@Test
	public void verifyLoginWithValidCred()
	{
		FbPage p1=new FbPage(driver);
		
		String x1="D:\\Data.xlsx";
		String sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(x1, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutil.getCellValue(x1, sheet, i, 0);
			System.out.println("Username---"+UserName);
			String Pwd=Excelutil.getCellValue(x1, sheet, i, 1);
			System.out.println("Password---"+Pwd);
			
			p1.setvalues(UserName, Pwd);
			p1.login();
		}
	}

}
