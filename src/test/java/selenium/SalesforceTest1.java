package selenium;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Browserutility;

public class SalesforceTest1 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		WebElement usernm=driver.findElement(By.xpath("//input[@id='username']"));
		String filepath= System.getProperty("user.dir")+"/src/main/java/Credential.properties";
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(filepath);
		prop.load(fi);
		System.getProperties().putAll(prop);
		String userName = prop.getProperty("UserName");
		usernm.sendKeys(userName);
		WebElement passwordElement=driver.findElement(By.xpath("//input[@id='password']"));
		passwordElement.clear();
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//div[@id='error']"));
		System.out.println(error.getText());
		if(error.getText().trim().equals("Please enter your password.")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("FAIL");
		}
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
