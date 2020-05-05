package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

public class Salesforce7 extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		rp.CreatReport();
		rp.CreatTest("Salesforce7");
		rp.logger.log(LogStatus.INFO, "Browser Launched");
		rp.logger.log(LogStatus.INFO, "Login successfully");
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		
		userdpdw.click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitforvisiblity(profile);
		if (profile.getText().equals("My Profile")) {
			rp.logger.log(LogStatus.PASS, "Test pass");
		}
		profile.click();
		Thread.sleep(1000);
		WebElement dropdwn = driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		dropdwn.click();
		WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		waitforvisiblity(edit);
		edit.click();
		Thread.sleep(1000);
		WebElement formiframe = driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		driver.switchTo().frame(formiframe);
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		waitforvisiblity(lname);
		lname.clear();
		Thread.sleep(1000);
		lname.sendKeys("p");
		Thread.sleep(1000);
		WebElement save = driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		waitforvisiblity(save);
		save.click();
		WebElement newlastname = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		waitforvisiblity(newlastname);
		System.out.println(newlastname.getText());
		if (newlastname.getText().trim().equals("Priti p")) {
			rp.logger.log(LogStatus.PASS, "Test pass last name is Priti p");
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		Thread.sleep(1000);
		WebElement post = driver
				.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		post.click();
		Thread.sleep(2000);
		WebElement textframe=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(textframe);
		//textframe.click();
		WebElement text=driver.findElement(By.cssSelector("body"));
	
		text.sendKeys("WELCOME");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement share1=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		waitforvisiblity(share1);
		share1.click();
		Thread.sleep(2000);
		WebElement file = driver.findElement(By.xpath("//span[contains(text(),'File')]"));
		file.click();
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		waitforvisiblity(upload);
		upload.click();
		Thread.sleep(2000);
		WebElement chosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		waitforvisiblity(chosefile);
		chosefile.sendKeys("C:\\Users\\Pankaj Kumar\\Downloads\\Image.jpg");
		Thread.sleep(5000);

		WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		waitforvisiblity(share);
		share.click();

		Thread.sleep(3000);
		WebElement profileph = driver
				.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']"));
		waitforvisiblity(profileph);
		Actions act = new Actions(driver);
		act.moveToElement(profileph).build().perform();
		act.click();
		Thread.sleep(3000);
		WebElement addph = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		addph.click();
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		waitforvisiblity(iframe);
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		WebElement phupload = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		waitforvisiblity(phupload);
		phupload.sendKeys("C:\\java assignment\\images\\nature.jpg");
		Thread.sleep(5000);
		WebElement save2 = driver.findElement(By.xpath("//*[@id='j_id0:uploadFileForm:uploadBtn']"));
		waitforvisiblity(save2);
		save2.click();
		Thread.sleep(3000);
		Actions action=new Actions(driver); 
		  action.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 100, 20).perform();
		  driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click(); 
		  driver.switchTo().defaultContent();	
		Thread.sleep(7000);
		quitBrowser();
		rp.EndTestCase();
		rp.EndReport();
//		

	}

}
