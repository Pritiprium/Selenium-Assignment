package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest9 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement console=driver.findElement(By.xpath("//a[@title=\"Developer Console (New Window)\"]"));
		waitforvisiblity(console);
		console.click();
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
