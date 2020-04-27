package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest27_Contact extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(2000);
		WebElement contact=driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		waitforvisiblity(contact);
		contact.click();
		Thread.sleep(2000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		WebElement selct=driver.findElement(By.xpath("//select[@id='fcf']"));
		waitforvisiblity(selct);
		selct.click();
		Thread.sleep(3000);
		WebElement recentNm=driver.findElement(By.xpath("//th[contains(@class,'')]//a[contains(text(),'prium')]"));
		waitforvisiblity(recentNm);
		recentNm.click();
	
	
	}
	
	

}
