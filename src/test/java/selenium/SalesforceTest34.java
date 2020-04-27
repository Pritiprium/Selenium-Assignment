package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SalesforceTest34 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
		waitforvisiblity(home);
		home.click();
		Thread.sleep(3000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]"));
		date.click();
		Thread.sleep(3000);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTO(0,document.body.scrollHeight)");
//		Thread.sleep(4000);
		WebElement time=driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:4:j_id64']"));
		waitforvisiblity(time);
		time.click();
		Thread.sleep(2000);
		WebElement subject=driver.findElement(By.xpath("//input[@id='evt5']"));
		waitforvisiblity(subject);
		subject.sendKeys("others");
		Thread.sleep(2000);
		WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		waitforvisiblity(endtime);
		endtime.click();
		Thread.sleep(2000);
		WebElement ninepm=driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		ninepm.click();
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(5000);
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
