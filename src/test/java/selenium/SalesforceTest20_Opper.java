package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest20_Opper extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement opper = driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		waitforvisiblity(opper);
		opper.click();
		Thread.sleep(3000);
		WebElement interval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select drpdwn = new Select(interval);
		drpdwn.selectByIndex(2);
		Thread.sleep(2000);
		WebElement include = driver.findElement(By.xpath("//select[@id='open']"));
		waitforvisiblity(include);
		Select drpdwn1 = new Select(include);
		drpdwn1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement runreport=driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]"));
		waitforvisiblity(runreport);
		runreport.click();
		Thread.sleep(10000);
		driver.quit();
		

	}

}
