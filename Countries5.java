package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Countries5 
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void before()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void India()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void Dubai()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Dubai");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void NewZealand()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("New Zealand");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void Canada()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Canada");
		search.sendKeys(Keys.ENTER);  	
	}
	@AfterMethod
	public void after() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
