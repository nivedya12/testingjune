package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cart {
	WebDriver driver;
	By field=By.xpath("//*[@id=\"s\"]");
	By submit=By.xpath("//*[@id=\"searchsubmit\"]");
	By dropdown=By.xpath("//*[@id=\"wpo-filter\"]/form/label/select");
	By milma=By.xpath("//*[@id=\"wpo-main-content\"]/div[2]/div/div[1]/div/div[3]/div[1]/a");
	By addcart=By.xpath("//*[@id=\"single-product\"]/div/div[2]/div/form/button");
	public Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	public void item() throws InterruptedException
	{
		driver.findElement(field).sendKeys("milma ghee");
		Thread.sleep(2000);
		driver.findElement(submit).click();
		//driver.findElement(addcart).click();
		Thread.sleep(2000);
		WebElement dropdn=driver.findElement(dropdown);
		Select sel=new Select(dropdn);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(milma).click();
		Thread.sleep(2000);
		driver.findElement(addcart).click();
		Thread.sleep(2000);
		
	} 

}
