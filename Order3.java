package TestNGPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Order3 
{
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	@Test
	public void xyz()
	{
		System.out.println("@Test-xyz");
	}
	@Test
	public void abc()
	{
		System.out.println("@Test-abc");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	
}
