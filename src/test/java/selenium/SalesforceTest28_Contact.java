package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest28_Contact  extends Browserutility{

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
//		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
//		closebtn.click();
//		Thread.sleep(2000);
		WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitforvisiblity(createnew);
		createnew.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement veiwUn=driver.findElement(By.xpath("//input[@id='devname']"));
		waitforvisiblity(veiwUn);
		veiwUn.sendKeys("EFGH");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		waitforvisiblity(save);
		save.click();
		WebElement error=driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"));
		waitforvisiblity(error);
		System.out.println(error.getText());
		Thread.sleep(3000);
		if(error.getText().trim().equals("Error: You must enter a value")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
