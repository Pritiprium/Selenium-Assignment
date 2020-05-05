package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest12_AC extends Browserutility{

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
//		Thread.sleep(1000);
		WebElement creatN_AC=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitforvisiblity(creatN_AC);
		creatN_AC.click();
		Thread.sleep(1000);
		WebElement veiwName=driver.findElement(By.xpath("//input[@id='fname']"));
		waitforvisiblity(veiwName);
		veiwName.sendKeys("ABC");
		Thread.sleep(2000);
		WebElement veiwUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		waitforvisiblity(veiwUniqueName);
		veiwUniqueName.sendKeys("123");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
