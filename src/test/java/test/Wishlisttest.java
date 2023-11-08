package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Wishlist;

public class Wishlisttest extends Basecls {
	
	@Test
	public void test() throws InterruptedException
	{
		Wishlist obj=new Wishlist();
		obj.whishlistpage();
	}

}
