package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest30_Contact extends Browserutility{

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
		WebElement neww=driver.findElement(By.xpath("//input[@name='new']"));
		waitforvisiblity(neww);
		neww.click();
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		Lname.sendKeys("Indian");
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.xpath("//input[@id='con4']"));
		waitforvisiblity(account);
		account.sendKeys("Global Media");
		Thread.sleep(2000);
		WebElement saveN=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]"));
		waitforvisiblity(saveN);
		saveN.click();
		Thread.sleep(5000);
		WebElement error=driver.findElement(By.xpath("//div[@id='errorDiv_ep']"));
		waitforvisiblity(error);
		System.out.println(error.getText());
		if(error.getText().trim().equals("Error: Invalid Data.\r\n" + 
				"Review all error messages below to correct your data.")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
