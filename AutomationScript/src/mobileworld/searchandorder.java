package mobileworld;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchandorder {
	public class Search extends Launch
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	@Test
	(priority=2)
	public void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
		WebElement ele = driver.findElement(By.xpath("//b[.All Mobile Details']"));
		Assert.assertTrue(ele.isDisplayed());
		driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy,( 0,700");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[.='Our New Feature Courses']")).isDisplayed());
		driver.findElement(By.xpath("//a[.='Order'])[4]")).click();
	}
	@Test(priority = 3) public void Order() throws InterruptedException, Exception
	{
		Set window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		Thread.sleep(2000);
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
		driver.findElement(By.id("inputFirstName")).sendkeys("nisha");
		driver.findElement(By.xpath("//[@id='inputFirstName'][2]")).sendKeys("mathavan");
		driver.findElement(By.id("inputEmail")).sendKeys("nisha@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Nisha@123");
		driver.findElement(By.xpath("flexRadioDefault2")).click();
		driver.findElement(By.xpath("//*[@placeholder='0000000000000']")).sendKeys("123456");
		driver.findElement(By.id("address1")).sendKeys("abcdef ghij kljhg jhun");
		driver.findElement(By.id("address2")).sendKeys("abcd cvgb nkjh hnj nmjhg");
		driver.findElement(By.id("inputCity")).sendKeys("Madurai");
		WebElement dropdown = driver.findElement(By.id("inputState"));
		Select sle= new Select(dropdown);sle.selectByVisibleText("TamilNadu");
		driver.findElement(By.id("inputzip")).sendKeys("600030");
		driver.findElement(By.xpath("//*[.='Apple]")).click();
		driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("3");
		WebElement dpdwn2 = driver.findElement(By.id("bought"));
		Select sle2= new Select(dpdwn2);sle2.selectByValue("0");
		driver.findElement(By.xpath("//*[@id='gridCheck1']"));
		driver.findElement(By.xpath("//*[@id='gridCheck1''])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
				
			
	}
	

}
