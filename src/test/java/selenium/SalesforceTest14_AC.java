package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest14_AC extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement account=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitforvisiblity(account);
		account.click();
		Thread.sleep(3000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		WebElement mergeAC=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		waitforvisiblity(mergeAC);
		mergeAC.click();
		WebElement acnm=driver.findElement(By.xpath("//input[@id='srch']"));
		acnm.sendKeys("pritiprium");
		WebElement findac=driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"));
		waitforvisiblity(findac);
		findac.click();
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("//input[@id='cid0']"));
		click.click();
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
		next.click();
		
		
		
		//NOT COMPLETED
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
