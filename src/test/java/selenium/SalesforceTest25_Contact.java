package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest25_Contact extends Browserutility{

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
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);

		WebElement neww=driver.findElement(By.xpath("//input[@name='new']"));
		waitforvisiblity(neww);
		neww.click();
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		Lname.sendKeys("p");
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.xpath("//input[@id='con4']"));
		waitforvisiblity(account);
		account.sendKeys("pankaj");
		Thread.sleep(2000);
		
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(4000);
		driver.quit();

	}

}
