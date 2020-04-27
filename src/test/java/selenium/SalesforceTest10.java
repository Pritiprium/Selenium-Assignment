package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest10 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitforvisiblity(logout);
		logout.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
