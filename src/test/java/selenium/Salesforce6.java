package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Salesforce6 extends Browserutility {

	public static void main(String[] args) throws Exception {
		Report_utility rp = new Report_utility();
		launchbrwsr("ch");
		
		
		loginto();
		Thread.sleep(2000);
		rp.CreatReport();
		rp.CreatTest("Salesforce6");
		rp.logger.log(LogStatus.INFO, "Browser Launch");
		rp.logger.log(LogStatus.INFO, "login Successfully");
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		
		TakeScreenShot();
	
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		String pathdestinationimage = System.getProperty("user.dir")+"//ScreenShot//image.png";
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File(pathdestinationimage);
//		FileUtils.copyFile(source, destination);
//		rp.logger.log(LogStatus.PASS, rp.logger.addScreenCapture(pathdestinationimage));
//		
//		
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitforvisiblity(profile);
		System.out.println(profile.getText());
		if (profile.getText().trim().equals("My Profile")) {
			rp.logger.log(LogStatus.PASS, "Test Pass");
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		WebElement setting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		waitforvisiblity(setting);
		System.out.println(setting.getText());
		Thread.sleep(2000);
		if (setting.getText().trim().equals("My Settings")) {
			rp.logger.log(LogStatus.PASS, "Test Pass");
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
			rp.logger.log(LogStatus.PASS, "Test case Pass printing Text ");
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		Thread.sleep(4000);
		driver.quit();
		rp.EndTestCase();
		rp.EndReport();
		
		
	}

}
