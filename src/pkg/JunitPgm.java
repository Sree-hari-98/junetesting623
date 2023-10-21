package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitPgm {
	@Before
	public void setup()
	{
		System.out.println("Browser Open");
	}
	@Test
	public void titleverification()
	{
		System.out.println("Test Activities");
	}
	@Test
	public void content()
	{
		System.out.println("Content");
	}
	@After
	public void browserclose()
	{
		System.out.println("Browser Close");
	}

}
