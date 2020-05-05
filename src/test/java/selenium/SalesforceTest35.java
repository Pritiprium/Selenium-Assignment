package selenium;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SalesforceTest35 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
		waitforvisiblity(home);
		home.click();
		Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.xpath("//span[@class=\"pageDescription\"]//a[1]"));
		date.click();
		Thread.sleep(3000);
		WebElement time=driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']"));
		waitforvisiblity(time);
		time.click();
		Thread.sleep(2000);
		WebElement subject=driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		waitforvisiblity(subject);
		subject.click();
		Thread.sleep(2000);
		ArrayList <String> newtab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		Thread.sleep(2000);
		
		WebElement other=driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		waitforvisiblity(other);
		other.click();
		driver.switchTo().window(newtab.get(0));
		Thread.sleep(2000);
		WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		waitforvisiblity(endtime);
		endtime.click();
		Thread.sleep(2000);
		WebElement sevenpm=driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
		sevenpm.click();
		Thread.sleep(2000);
		WebElement reclick=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		waitforvisiblity(reclick);
		reclick.click();
		Thread.sleep(2000);
		WebElement weekly=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		waitforvisiblity(weekly);
		weekly.click();
		Thread.sleep(3000);
		WebElement endDt=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		waitforvisiblity(endDt);
		endDt.sendKeys("5/5/2020");
		endDt.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
