package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest15_AC extends Browserutility {

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
//		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
//		closebtn.click();
//		Thread.sleep(2000);
		WebElement lastActivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		lastActivity.click();
		Thread.sleep(2000);
		WebElement dateField=driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		dateField.click();
		Thread.sleep(2000);
		WebElement createDt=driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		waitforvisiblity(createDt);
		createDt.click();
		Thread.sleep(2000);
		WebElement fromDt=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		fromDt.click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//span[contains(text(),'25')]"));
		waitforvisiblity(date);
		date.click();
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		to.click();
		Thread.sleep(3000);
	
		WebElement today=driver.findElement(By.xpath("//button[contains(text(),'Today')][1]"));

		Thread.sleep(3000);
		today.click();
		
		Thread.sleep(2000);
		WebElement sv=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		waitforvisiblity(sv);
		sv.click();
		Thread.sleep(2000);
		WebElement repotName=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		repotName.sendKeys("Report1");
		Thread.sleep(2000);
		WebElement uniqueRepot=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		uniqueRepot.sendKeys("NewReport");
		Thread.sleep(2000);
		
		WebElement saveNrun=driver.findElement(By.xpath("//button[@id='ext-gen330']"));
		waitforvisiblity(saveNrun);
		saveNrun.click();
		
		//NOT COMPLETED
		
		
		
		
		
		
		//		WebElement march=driver.findElement(By.xpath("//button[@id='ext-gen273']"));
//		march.click();
//		Thread.sleep(2000);
//		WebElement april=driver.findElement(By.xpath("//a[contains(text(),'Apr')]"));
//		waitforvisiblity(april);
//		april.click();
//		Thread.sleep(2000);
//		WebElement ok=driver.findElement(By.xpath("//button[@class='x-date-mp-ok']"));
//		ok.click();
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
//		Select drpdwn =new Select(dateField);
//		drpdwn.selectByVisibleText("created Date");
		
		
		
		
		
		
		
		
		
		
	}

}
