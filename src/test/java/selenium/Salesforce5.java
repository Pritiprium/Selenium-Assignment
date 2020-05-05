package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Salesforce5 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		rp.CreatReport();
		rp.CreatTest("Salesforce5");
		rp.logger.log(LogStatus.INFO, "Browser Launch Successfully");
		WebElement usernm=driver.findElement(By.xpath("//input[@id='username']"));
		usernm.sendKeys("1234");
		
		WebElement passwordElement=driver.findElement(By.xpath("//input[@id='password']"));
		passwordElement.sendKeys("12234");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(2000);
		rp.logger.log(LogStatus.INFO, "Login Successfully");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String pathdestinationimage = System.getProperty("user.dir")+"//ScreenShot//image.png";
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(pathdestinationimage);
		FileUtils.copyFile(source, destination);
		
		rp.logger.log(LogStatus.PASS, rp.logger.addScreenCapture(pathdestinationimage));
		
		
		WebElement msg=driver.findElement(By.xpath("//div[@id='error']"));
		waitforvisiblity(msg);
		System.out.println(msg.getText());
		Thread.sleep(2000);
	if(msg.getText().trim().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.")){
		rp.logger.log(LogStatus.PASS, "Test case pass");
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		Thread.sleep(4000);
		driver.quit();
		rp.EndTestCase();
		rp.EndReport();
	}

}
