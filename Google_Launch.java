package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_Launch 
{
	ChromeDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
	}
	@Test
	public void action()
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
