package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest32_home extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
		waitforvisiblity(home);
		home.click();
		Thread.sleep(2000);
		WebElement fNlN=driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'Priti p')]"));
		fNlN.click();
		Thread.sleep(2000);
		WebElement edit=driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		edit.click();
		Thread.sleep(2000);
		WebElement editprofile=driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
//		waitforvisiblity(editprofile);
		editprofile.click();
		Thread.sleep(4000);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		Thread.sleep(2000);
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		waitforvisiblity(lname);
		lname.clear();
		Thread.sleep(1000);
		lname.sendKeys("Abcd");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(7000);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
