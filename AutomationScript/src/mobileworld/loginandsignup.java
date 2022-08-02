package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginandsignup {
@Test
(dependsOnMethods= {"Launching _the_browser}")
public void SignUp_for_Mobile() throws InterruptedException
{
	WebElement Signin = driver.findElement(By.xpath("/button[text()='SIGN IN']"));
	Signin.click();
	WebElement Signin = driver.findElement(By.xpath("a[text()='Sign up']"));
	Signup.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@id()='myName']"));
	firstname.sendKeys("nisha");
	WebElement Lat_name = driver.findElement(By.xpath("//input[@placeholder='LastName']"));
	Last_name.sendKeys("mathavan");
	WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
	Email.sendKeys("nisha@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type=Password"));
	password.sendKeys("Nisha@1999");
	WebElement Phone_number = driver.findElement(By.xpath("//input[@type='Password"));
	Phone_number.sendKeys("9789454701");
	driver.findElement(By.xpath("//input[@type= 'radio']")).click();
	driver.findElement(By.xpath("//button[@type='date']")).click();
	Alert Al = driver.switchTo()
	
	
	
	
}
}

}
