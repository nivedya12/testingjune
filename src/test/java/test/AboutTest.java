package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.AboutUsTitleverify;

public class AboutTest extends Basecls{
	@Test
	public void test() throws InterruptedException
	{
		AboutUsTitleverify	obj=new AboutUsTitleverify(driver);
		obj.titleverify();
		
	}

}
