package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AboutUsTitleverify {
		WebDriver driver;
		By label=By.xpath("//*[@id=\"main-menu\"]/li[2]/a");
		
		public AboutUsTitleverify(WebDriver driver)
		{
			this.driver=driver;
		}
		public void titleverify() throws InterruptedException
		{
			driver.findElement(label).click();
			Thread.sleep(2000);
			String actual=driver.getCurrentUrl();
			System.out.println(actual);
			String expected="https://sooryaonlineshopping.com/about-us/";
			if(actual.equals(expected))
			{
				System.out.println("passed");
				
			}
			else
			{
				System.out.println("it is not a correct link");
			}
	
		}
		

}
