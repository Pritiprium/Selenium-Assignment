package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest8 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement setting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		setting.click();
		WebElement pagedisplay=driver.findElement(By.xpath("//a[@id='PersonalSetup_font']"));
		System.out.println(pagedisplay.getText());
		if(pagedisplay.getText().trim().equals("My Settings")) {
			System.out.println("Setting page is displayed");
		}else {
			System.out.println("FAIL");
		}

		WebElement personal=driver.findElement(By.id("PersonalInfo_font"));
		waitforvisiblity(personal);
		personal.click();
		Thread.sleep(2000);
		WebElement loginhistory=driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		waitforvisiblity(loginhistory);
		loginhistory.click();
		Thread.sleep(2000);
		WebElement dwnld_history=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		dwnld_history.click();
		Thread.sleep(3000);
		WebElement displayNlayout=driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
		waitforvisiblity(displayNlayout);
		displayNlayout.click();
		WebElement customized=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		customized.click();
		Thread.sleep(2000);
		WebElement customApp=driver.findElement(By.xpath("//select[@id='p4']"));
		customApp.click();
		Select dropdwn = new Select(customApp);
		Thread.sleep(2000);
		dropdwn.selectByIndex(8);
		Thread.sleep(2000);
		WebElement reports=driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		waitforvisiblity(reports);
		reports.click();
		Thread.sleep(2000);
		
		
	
		WebElement add=driver.findElement(By.xpath("//div[contains(text(),'Add')]"));
		waitforvisiblity(add);
		add.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		email.click();
		Thread.sleep(1000);
		WebElement emailsetting=driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		emailsetting.click();
		Thread.sleep(2000);
		WebElement emailName=driver.findElement(By.xpath("//input[@id='sender_name']"));
		emailName.sendKeys("Priti P");
		Thread.sleep(1000);
		WebElement emailadd=driver.findElement(By.xpath("//input[@id='sender_email']"));
		emailadd.sendKeys("pritiprium23@gmail.com");
		Thread.sleep(1000);
		WebElement automaticbutton=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		automaticbutton.click();
		Thread.sleep(1000);
		WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
		save.click();
		Thread.sleep(2000);
		WebElement calender=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		waitforvisiblity(calender);
		calender.click();
		Thread.sleep(2000);
		WebElement activityreminder=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		
		activityreminder.click();
		WebElement openReminder=driver.findElement(By.xpath("//input[@id='testbtn']"));
		openReminder.click();
	
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
