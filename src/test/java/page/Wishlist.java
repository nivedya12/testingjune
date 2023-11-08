package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Wishlist {
	WebDriver driver;

	By shoplabel=By.xpath("//*[@id=\"main-menu\"]/li[3]/a");
	By box=By.xpath("//*[@id=\"wpo-filter\"]/ul/li[2]/a/i");
	By productlink=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[1]/a");
	//By addcart=By.xpath("//*[@id=\"single-product\"]/div/div[2]/div/form/button");
	By shop_labl=By.xpath("//*[@id=\"main-menu\"]/li[3]/a");
	//By button=By.xpath("//*[@id=\"wpo-filter\"]/ul/li[2]/a/i");
	//By p_link=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[1]/a");
	By wishlist=By.xpath("//*[@id=\"single-product\"]/div/div[2]/div/div[1]/div[1]/a/span");
	By Wishlist2=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div[2]/div[1]/a");
	By move=By.xpath("//*[@id=\"wpo-main-content\"]/div[3]/nav/ul/li[9]/a");
	
	
	public void Whishlist(WebDriver driver)
	{
		this.driver=driver;
	}
	public void whishlistpage() throws InterruptedException
	{
		driver.findElement(shoplabel).click();
		Thread.sleep(2000);
		driver.findElement(box).click();
		driver.findElement(productlink).click();
		Thread.sleep(2000);
		driver.findElement(wishlist).click();
		Thread.sleep(2000);
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)","");
		driver.findElement(move).click();
		Thread.sleep(2000);
		driver.findElement(Wishlist2).click();
	}
	

}
