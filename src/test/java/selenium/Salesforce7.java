package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Salesforce7 extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement userdpdw = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		waitforvisiblity(userdpdw);
		userdpdw.click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitforvisiblity(profile);
		profile.click();
		Thread.sleep(1000);
		WebElement dropdwn=driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		dropdwn.click();
		WebElement edit=driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		waitforvisiblity(edit);
		edit.click();
		Thread.sleep(1000);
		WebElement formiframe=driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		driver.switchTo().frame(formiframe);
		Thread.sleep(1000);
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		waitforvisiblity(lname);
		lname.clear();
		Thread.sleep(1000);
		lname.sendKeys("p");
		Thread.sleep(1000);
		WebElement save=driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		waitforvisiblity(save);
		save.click();
		WebElement newlastname=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		waitforvisiblity(newlastname);
		System.out.println(newlastname.getText());
		if(newlastname.getText().trim().equals("Priti p")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		Thread.sleep(1000);
		WebElement post=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		post.click();
//		WebElement textframe=driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
//		driver.switchTo().frame(textframe);
//		//textframe.click();
//		WebElement text=driver.findElement(By.xpath("//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]"));
//		
//		text.sendKeys("WELCOME");
//		Thread.sleep(2000);
//		WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
//		waitforvisiblity(share);
//		share.click();
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
		file.click();
		Thread.sleep(2000);
		WebElement upload=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		waitforvisiblity(upload);
		upload.click();
		Thread.sleep(2000);
		WebElement chosefile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		waitforvisiblity(chosefile);
		chosefile.sendKeys("C:\\Users\\Pankaj Kumar\\Downloads\\Image.jpg");
		Thread.sleep(5000);
		WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		waitforvisiblity(share);
		share.click();
		
	
		Thread.sleep(3000);	
		WebElement profileph=driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']"));
		waitforvisiblity(profileph);
		Actions act = new Actions(driver);
		act.moveToElement(profileph).build().perform();
		act.click();
		Thread.sleep(3000);
		WebElement addph=driver.findElement(By.xpath("//a[@id='uploadLink']"));
		addph.click();
		Thread.sleep(3000);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		waitforvisiblity(iframe);
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		WebElement phupload=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		waitforvisiblity(phupload);
		phupload.sendKeys("C:\\java assignment\\images\\nature.jpg");
		Thread.sleep(4000);
		WebElement iframe2=driver.findElement(By.xpath("//div[@class='uploadButtonPanel']"));
		waitforvisiblity(iframe2);
		Thread.sleep(2000);
		driver.switchTo().frame(iframe2);
		Thread.sleep(2000);
		WebElement save2=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save']"));
		waitforvisiblity(save2);
		save2.click();
		
		
		
		
		
//		driver.quit();
//		
		
		
		
	}

}
