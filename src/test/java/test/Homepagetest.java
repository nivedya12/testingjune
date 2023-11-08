package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Homepage;

public class Homepagetest extends Basecls {
	@Test
	public void test1() throws InterruptedException
	{
		Homepage obj=new Homepage(driver);
		obj.page();
		
		
	}

}
