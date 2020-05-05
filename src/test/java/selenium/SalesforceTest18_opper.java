package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest18_opper extends Browserutility{

	public static void main(String[] args) throws Exception  {
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
//		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
//		closebtn.click();
		WebElement opperPipln=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		waitforvisiblity(opperPipln);
		opperPipln.click();
		Thread.sleep(10000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
