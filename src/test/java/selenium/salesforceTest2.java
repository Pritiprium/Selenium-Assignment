package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class salesforceTest2 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(3000);
	WebElement home=driver.findElement(By.id("home_Tab"));
	waitforvisiblity(home);
	System.out.println(home.getText());
	Thread.sleep(3000);
	if(home.getText().trim().equals("Home")) {
		System.out.println("HOME Page Displayed--->PASS");
	}
	else {
		System.out.println("FAIL");
	}
	Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
