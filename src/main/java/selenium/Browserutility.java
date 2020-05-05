package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserutility {

	public static WebDriver driver = null;
	static Report_utility rp = new Report_utility();

	public static void launchbrwsr(String browser) {
		if (browser.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
		} else {
			System.out.println("invaid Browser");
		}
	}

	public static void loginto() throws IOException {
		String filepath = System.getProperty("user.dir") + "/src/main/java/Credential.properties";
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(filepath);
		prop.load(fi);
		System.getProperties().putAll(prop);
		System.out.println("property value of username  " + System.getProperty("Username"));

		String userName = prop.getProperty("UserName");
		String password = prop.getProperty("Password");

		System.out.println(" userName >> " + userName);
		System.out.println(" password >> " + password);

		WebElement usernameElement = driver.findElement(By.xpath("//input[@id='username']"));
		usernameElement.sendKeys(userName);

		WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
		passwordElement.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}

	public static void waitforvisiblity(WebElement elementtowait) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elementtowait));
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void logout() throws Exception {
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitforvisiblity(logout);
		logout.click();
	}
	
	public static void TakeScreenShot() throws Exception {
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		String imagePath = System.getProperty("user.dir")+"//ScreenShot//" + new SimpleDateFormat("'image_'YYYYMMddHHmm'.png'").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(imagePath);
		FileUtils.copyFile(source, destination);
		rp.logger.log(LogStatus.PASS, rp.logger.addScreenCapture(imagePath));		//this for merging scrrenshot to extent Report
	}
	
	

}
