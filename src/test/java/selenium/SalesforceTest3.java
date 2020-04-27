package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceTest3 extends Browserutility {

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
		String password = prop.getProperty("Password");
		WebElement passwordElement=driver.findElement(By.xpath("//input[@id='password']"));
		passwordElement.sendKeys(password);
		Thread.sleep(2000);
		WebElement chkbox=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		waitforvisiblity(chkbox);
		chkbox.click();
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(2000);
		WebElement userdpdw=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitforvisiblity(logout);
		logout.click();
		Thread.sleep(4000);
			
		driver.quit();

	}

}
