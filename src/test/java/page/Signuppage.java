package page;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signuppage {
	WebDriver driver;
	By loginlabel=By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/a");
	By uname=By.xpath("//*[@id=\"username\"]");
	By pas=By.xpath("//*[@id=\"password\"]");
	By button=By.xpath("//*[@id=\"post-55\"]/div/form/div[3]/input[3]");
	By rem=By.xpath("//*[@id=\"rememberme\"]");
	public Signuppage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void usersignup(String username,String password)
	{
	//	driver.switchTo().alert().dismiss();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(loginlabel).click();
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pas).sendKeys(password);
		driver.findElement(rem).click();
		driver.findElement(button).click();
		
	}
	}
