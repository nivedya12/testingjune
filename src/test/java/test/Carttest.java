package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Cart;

public class Carttest extends Basecls {
	@Test
	public void select() throws InterruptedException
	{
		Cart object=new Cart(driver);
		driver.manage().window().maximize();
		object.item();
	}
	

}
