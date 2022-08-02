package mobileworld;

public class launch {
	WebDriver driver;
	@Test public void Launching_the_Browser()
	{
		System.setProperty("webdriver.chrome.driver",".C:\\Users\\nishalini.mathavan\\Downloads\\chromedriver_win32.exe");
		driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
				
	}

}
