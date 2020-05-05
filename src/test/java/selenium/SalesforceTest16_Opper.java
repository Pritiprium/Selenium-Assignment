package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest16_Opper extends Browserutility {

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
		WebElement veiw=driver.findElement(By.xpath("//select[@id='fcf']"));
		waitforvisiblity(veiw);
		System.out.println(veiw.getText());
		veiw.click();
		Thread.sleep(2000);
		Select drpdwn = new Select(veiw);
		drpdwn.selectByIndex(0);
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
