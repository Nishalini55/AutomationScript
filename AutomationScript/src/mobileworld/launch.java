package mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {

	@Test 
	public void Launching_the_Browser()
	{
		//System.setProperty("webdriver.chrome.driver",".C:\\Users\\nishalini.mathavan\\Downloads\\chromedriver_win32.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
				
	}
}








