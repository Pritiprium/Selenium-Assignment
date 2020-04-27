package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserutility {

	public static WebDriver driver = null;

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
	public static void logout() {
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitforvisiblity(logout);
		logout.click();
	}

}
