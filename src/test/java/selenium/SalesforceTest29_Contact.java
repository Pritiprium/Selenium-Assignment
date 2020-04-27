package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest29_Contact extends Browserutility{

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
		WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitforvisiblity(createnew);
		createnew.click();
		Thread.sleep(2000);
		WebElement veiwN=driver.findElement(By.xpath("//input[@id='fname']"));
		waitforvisiblity(veiwN);
		veiwN.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement veiwUn=driver.findElement(By.xpath("//input[@id='devname']"));
		waitforvisiblity(veiwUn);
		veiwUn.sendKeys("EFGH");
		Thread.sleep(2000);
		WebElement cancle=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
		waitforvisiblity(cancle);
		cancle.click();
		Thread.sleep(6000);
		driver.quit();
		
		
		
		

	}

}
