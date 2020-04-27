package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Salesforce6 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitforvisiblity(profile);
		System.out.println(profile.getText());
		if (profile.getText().trim().equals("My Profile")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		WebElement setting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		waitforvisiblity(setting);
		System.out.println(setting.getText());
		Thread.sleep(2000);
		if (setting.getText().trim().equals("My Settings")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		Thread.sleep(2000);
		WebElement console=driver.findElement(By.xpath("//a[@title=\"Developer Console (New Window)\"]"));
		waitforvisiblity(console);
		System.out.println(console.getText());
		Thread.sleep(2000);
		if(console.getText().trim().equals("Developer Console")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitforvisiblity(logout);
		System.out.println(logout.getText());
		Thread.sleep(2000);
		if(logout.getText().trim().equals("Logout")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		Thread.sleep(2000);
		WebElement light=driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']"));
		waitforvisiblity(light);
		System.out.println(light.getText());
		Thread.sleep(2000);
		if(light.getText().trim().equals("Switch to Lightning Experience")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
