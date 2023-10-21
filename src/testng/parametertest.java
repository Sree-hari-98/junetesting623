package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	@Parameters("a")
	@Test
	public void main(String a)
	{
		System.out.println("Value is : "+a);
	}

}
