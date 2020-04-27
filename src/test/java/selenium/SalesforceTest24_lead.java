package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest24_lead extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement leads=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
		waitforvisiblity(leads);
		leads.click();
		Thread.sleep(4000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		WebElement neww=driver.findElement(By.xpath("//input[@name='new']"));
		neww.click();
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		waitforvisiblity(lname);
		lname.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement cmpny=driver.findElement(By.xpath("//input[@id='lea3']"));
		waitforvisiblity(cmpny);
		cmpny.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
