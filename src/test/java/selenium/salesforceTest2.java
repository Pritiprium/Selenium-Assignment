package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class salesforceTest2 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
	WebElement text=driver.findElement(By.xpath("//h2[@id='header']"));
	System.out.println(text.getText());
	Thread.sleep(3000);
	if(text.getText().trim().equals("Verify Your Identity")) {
		System.out.println("HOME Page Displayed--->PASS");
	}
	else {
		System.out.println("FAIL");
	}
	Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
