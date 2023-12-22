package TestNGPack;

import org.testng.annotations.Test;

public class PriorityTC 
{
	@Test(priority = 100, enabled = false)
	public void Tc1()
	{
		System.out.println("1");
	}
	@Test (invocationCount = 5)
	public void Tc2()
	{
		System.out.println("2");
	}
	@Test(priority=-3)
	public void Tc3()
	{
		System.out.println("3");
	}
	@Test(priority=1)
	public void Tc4()
	{
		System.out.println("4");
	}
}
