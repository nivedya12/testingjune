package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	WebDriver driver;
	By index=By.xpath("//*[@id=\"product_cat\"]");
	By submit=By.xpath("//*[@id=\"searchsubmit\"]");
	By itm=By.xpath("//*[@id=\"wpo-main-content\"]/div[3]/div/div[16]/div/div/div[2]/div[1]/a");
	By cart=By.xpath("//*[@id=\"single-product\"]/div/div[2]/div/form/button");
	By butn=By.xpath("//*[@id=\"wpo-filter\"]/ul/li[2]/a/i");
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void page() throws InterruptedException
	{
		driver.findElement(index).click();
		Thread.sleep(2000);
		WebElement idx=driver.findElement(index);
		Select sel=new Select(idx);
		Thread.sleep(2000);
		sel.selectByValue("spices-masalas");
		Thread.sleep(2000);
		driver.findElement(submit).click();
		Thread.sleep(2000);
		driver.findElement(butn).click();

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
		driver.findElement(itm).click();
		driver.findElement(cart).click();
		
	}
	

}
