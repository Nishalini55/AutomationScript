package mobileworld;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class loginandsignup {

	public class  Login extends lanuch
   {
@Test
public void SignUp_for_Mobile() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
			
    WebElement Signin = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
	Signin.click();
	WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
	Signup.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("nisha");
	WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='LastName']"));
	Last_name.sendKeys("mathavan");
	WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
	Email.sendKeys("nisha@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type=Password"));
	password.sendKeys("Nisha@1999");
	WebElement Phone_number = driver.findElement(By.xpath("//input[@type='Password"));
	Phone_number.sendKeys("9789454701");
	driver.findElement(By.xpath("//input[@type= 'radio']")).click();
	WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
	bio_story.sendKeys("Nisha is the employee who join the qualitest company in the last 2 month back ");
	driver.findElement(By.xpath("//input[@type='date']")).click();
	driver.findElement(By.xpath("//button[@type='date']")).click();
	Alert Al = driver.switchTo().alert();Al.accept();
	Thread.sleep(2000);
	WebElement user_name = driver.findElement(By.id("username"));
	user_name.click();
	user_name.sendKeys("nisha@gmail.com");
	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	Password.click();
	Password.sendKeys("Nisha@1999");
	driver.findElement(By.xpath("//a[text()='Log In'])")).click();
}
   }
}


