package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest21 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement leads=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
		waitforvisiblity(leads);
		leads.click();
		Thread.sleep(4000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(2000);
		WebElement veiw=driver.findElement(By.xpath("//select[@id='fcf']"));
		waitforvisiblity(veiw);
		veiw.click();
		Thread.sleep(2000);
		System.out.println(veiw.getText());
		
		Thread.sleep(3000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		logout();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
