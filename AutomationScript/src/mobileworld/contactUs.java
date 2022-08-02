package mobileworld;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contactUs extends Launch
{
	@Test(priority = 4)
	public void contactUs() throws Throwtable
	//System.setProperty("webdriver.chrome.driver",".C:\\Users\\nishalini.mathavan\\Downloads\\chromedriver_win32.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
}
{
	driver.finfElement(By.xpath("//a[@id='navbarDropdown']")).click();
	driver.findElement(By.linkText("Contact Us")).click();
	Set<String> window = driver.getWindowsHandles();
	List<String> list= new ArrayList<String>(window);
	driver.switchTo().window(list.get(1));
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	WebElement ele3 = driver.findElement(By.cssSelector("h3[class='title']"));
	AssertJUnit.assertTrue(ele3.isDisplayed());
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(),550)");
	driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("abcd");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("efg@gmail.com");
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("4568976");
	driver.findElement(By.xpath("//*[@name='messsage']")).sendKeys("jhgfk tyuhy sedr");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.switchTo().window(list.get(0));
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	String ele4 = driver.getTitle();
	if(ele4.equals("Mobile"))
	{
		System.out.println("TC is pass");
	}
	else
	{
		System.out.println("TC is fail");
	}
	}
}
	
	
	
	
	
	


