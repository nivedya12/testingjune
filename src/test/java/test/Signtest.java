package test;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Signuppage;

public class Signtest extends Basecls {
	@Test
	public void test()
	{
		Signuppage obj1=new Signuppage(driver);
		driver.manage().window().maximize();
		obj1.usersignup("anu","anN@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
