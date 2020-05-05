package selenium;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTestOpper17 extends Browserutility {

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
//		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
//		closebtn.click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		WebElement opName=driver.findElement(By.xpath("//input[@id='opp3']"));
		waitforvisiblity(opName);
		opName.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement acName=driver.findElement(By.xpath("//input[@id='opp4']"));
		acName.sendKeys("pankaj");
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//input[@id='opp9']"));
		waitforvisiblity(date);
	
		date.sendKeys("4/27/2020");
		date.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		 WebElement stage=driver.findElement(By.xpath("//a[contains(@class,'calToday')]"));
		 waitforvisiblity(stage);
		 stage.click();
//		 Select drpdwn =new Select(stage);
//		 drpdwn.selectByIndex(4);
//		 Thread.sleep(2000);
//		 WebElement text=driver.findElement(By.xpath("//select[@id='opp11']"));
//		 waitforvisiblity(text);
//		 text.click();
//		 Thread.sleep(2000);
		 WebElement probb=driver.findElement(By.xpath("//input[@id='opp12']"));
		 waitforvisiblity(probb);
		 probb.sendKeys("50");
		 Thread.sleep(2000);
		 WebElement cmngsrs=driver.findElement(By.xpath("//input[@id='opp17']"));
		 cmngsrs.sendKeys("N/A");
		 Thread.sleep(2000);
		 WebElement leadsrs=driver.findElement(By.xpath("//select[@id='opp6']"));
		 waitforvisiblity(leadsrs);
		 Select drpdwn1 =new Select(leadsrs);
		 drpdwn1.selectByIndex(2);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		 Thread.sleep(4000);
		 driver.quit();
		 //NOT COMPLETED
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		

		
	}

}
