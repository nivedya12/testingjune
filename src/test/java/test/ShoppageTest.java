package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Shoppage;

public class ShoppageTest extends Basecls {
	@Test
	public void test() throws InterruptedException
	{
		Shoppage obj=new Shoppage(driver);
		obj.buyitem();
				
	}

}
