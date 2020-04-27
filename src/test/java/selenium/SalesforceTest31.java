package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesforceTest31  extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		System.out.println(name.getText());
		name.click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitforvisiblity(profile);
		profile.click();
		Thread.sleep(4000);
		driver.quit();

	}

}
