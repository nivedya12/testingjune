package page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlinks {
	WebDriver driver;
	public Brokenlinks(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void link() throws IOException
	{
		  List<WebElement> links= driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
		  
		  for(int i=0;i<links.size();i++)
			  
		  {
			  WebElement element=links.get(i);
					  //href attribute for getting required url link
			  String url=element.getAttribute("href");
			  URL link=new URL(url);
			  //create connection usingurl obj link
			  HttpURLConnection con=(HttpURLConnection) link.openConnection();
			 // Thread.sleep(2000);
			  //establish connection
			  con.connect();
			  int rescode=con.getResponseCode();
			  if(rescode>=400)
			  {
				  System.out.println(url +"-" +"broken link");
				  
			  }
			  else
			  {
				  System.out.println(url +"-" +"valid link");
			  }
		  }
	}

}
