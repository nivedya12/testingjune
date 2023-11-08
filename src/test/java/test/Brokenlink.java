package test;
import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Brokenlinks;

public class Brokenlink extends Basecls
{
	@Test
	public void test() throws IOException
	
	{
	Brokenlinks obj=new Brokenlinks(driver);
	obj.link();


}}
