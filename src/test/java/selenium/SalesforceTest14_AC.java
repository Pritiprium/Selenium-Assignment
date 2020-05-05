package selenium;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
//		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
//		closebtn.click();
//		Thread.sleep(2000);
		WebElement mergeAC=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		waitforvisiblity(mergeAC);
		mergeAC.click();
		WebElement acnm=driver.findElement(By.xpath("//input[@id='srch']"));
		acnm.sendKeys("pankaj");
		WebElement findac=driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"));
		waitforvisiblity(findac);
		findac.click();
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.id("cid1"));
		click.click();
		Thread.sleep(2000);
		driver.findElement(By.id("cid2")).click();
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
		next.click();
		
		Thread.sleep(2000);
		WebElement merge=driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]"));
		waitforvisiblity(merge);
		merge.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		WebElement veiw=driver.findElement(By.xpath("//select[@name='fcf']"));
		veiw.click();
		Thread.sleep(2000);
		WebElement go = driver.findElement(By.xpath("//input[@name='go']"));
		go.click();
	
		
		
		
		
		
		
		
		
		
		//NOT COMPLETED
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
