package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest19_Opper extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement opper=driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		waitforvisiblity(opper);
		opper.click();
		Thread.sleep(3000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		WebElement stuck=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		stuck.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
