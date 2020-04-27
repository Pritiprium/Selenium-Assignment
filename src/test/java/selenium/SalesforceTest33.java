package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest33 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(2000);
		WebElement mytab=driver.findElement(By.xpath("//input[contains(@name,'customize')]"));
		waitforvisiblity(mytab);
		mytab.click();
		Thread.sleep(2000);
		WebElement library=driver.findElement(By.xpath("//option[contains(text(),'Libraries')]"));
		waitforvisiblity(library);
		library.click();
		Thread.sleep(2000);
		WebElement remove=driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"));
		remove.click();
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		logout();
		Thread.sleep(4000);
		loginto();
		Thread.sleep(2000);
		WebElement alltab1=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab1.click();
		Thread.sleep(2000);
		WebElement mytab1=driver.findElement(By.xpath("//input[contains(@name,'customize')]"));
		waitforvisiblity(mytab1);
		mytab1.click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
