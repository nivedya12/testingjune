package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Shoppage {
	WebDriver driver;
	
	By shoplabel=By.xpath("//*[@id=\"main-menu\"]/li[3]/a");
	By box=By.xpath("//*[@id=\"wpo-filter\"]/ul/li[2]/a/i");
	By productlink=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[1]/a");
	By count=By.xpath("//*[@id=\"quantity_654652b8d4611\"]");
	By addcart=By.xpath("//*[@id=\"single-product\"]/div/div[2]/div/form/button");
	By cart=By.xpath("//*[@id=\"main-menu\"]/li[5]/a");
	By proceed=By.xpath("//*[@id=\"post-53\"]/div/div[2]/div/div/a");
	By movearrow=By.xpath("//*[@id=\"wpo-main-content\"]/div[3]/nav/ul/li[11]/a");
	By item2=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[1]/a");
	By wishlist=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div[2]/div[1]/a/span");
	
	
	public Shoppage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void buyitem() throws InterruptedException
	{
		driver.findElement(shoplabel).click();
		Thread.sleep(2000);
		driver.findElement(box).click();
		Thread.sleep(2000);
		driver.findElement(productlink).click();
		Thread.sleep(2000);
		driver.findElement(count).sendKeys("4");
		driver.findElement(addcart).click();
		Thread.sleep(2000);
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)","");
		Thread.sleep(2000);
		driver.findElement(item2).click();
		driver.findElement(wishlist).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		driver.findElement(proceed);
	}
	
	
	

}
