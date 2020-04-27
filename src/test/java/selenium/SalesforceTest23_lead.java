package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest23_lead extends Browserutility{

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
		Select drpdwn = new Select(veiw);
		drpdwn.selectByIndex(3);
		Thread.sleep(2000);
		WebElement go=driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		go.click();
		
		

	}

}
