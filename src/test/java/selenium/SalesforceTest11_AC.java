package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest11_AC extends Browserutility {

	public static void main(String[] args) throws Exception {
	
		launchbrwsr("ch");
		loginto();
		Thread.sleep(1000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement account=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitforvisiblity(account);		
		account.click();
		Thread.sleep(2000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		WebElement neww=driver.findElement(By.xpath("//input[contains(@name,'new')]"));
		neww.click();
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		WebElement newAcName=driver.findElement(By.xpath("//input[@id='acc2']"));
		waitforvisiblity(newAcName);
		newAcName.sendKeys("Sleniumabc");
		Thread.sleep(2000);
		WebElement type=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select dropdwn = new Select(type);
		dropdwn.selectByIndex(6);
		Thread.sleep(2000);
		WebElement priority=driver.findElement(By.xpath("//select[@id='00N5w00000HXjWi']"));
		Select dd1 = new Select (priority);
		dd1.selectByIndex(1);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
