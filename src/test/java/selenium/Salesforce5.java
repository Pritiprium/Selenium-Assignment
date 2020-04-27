package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Salesforce5 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		WebElement usernm=driver.findElement(By.xpath("//input[@id='username']"));
		usernm.sendKeys("1234");
		
		WebElement passwordElement=driver.findElement(By.xpath("//input[@id='password']"));
		passwordElement.sendKeys("12234");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(2000);
		WebElement msg=driver.findElement(By.xpath("//div[@id='error']"));
		waitforvisiblity(msg);
		System.out.println(msg.getText());
		Thread.sleep(2000);
	if(msg.getText().trim().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.")){
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		Thread.sleep(4000);
		driver.quit();
		
	}

}
