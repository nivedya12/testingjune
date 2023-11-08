package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Basecls {
	public WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}	
	@BeforeMethod
	public void url()
	{
	
		driver.manage().window().maximize();
		driver.get("https://sooryaonlineshopping.com/");

	}

}
