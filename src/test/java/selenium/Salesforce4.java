package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Salesforce4 extends Browserutility{

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
		Thread.sleep(2000);
		WebElement forgpass=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		waitforvisiblity(forgpass);
		WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password?')]"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		if(text.getText().trim().equals("Forgot Your Password?")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		Thread.sleep(2000);
		forgpass.click();		
		
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@id='un']"));
		waitforvisiblity(user);
		user.sendKeys(userName);
		Thread.sleep(2000);
		WebElement contnue=driver.findElement(By.xpath("//input[@id='continue']"));
		waitforvisiblity(contnue);
		contnue.click();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
