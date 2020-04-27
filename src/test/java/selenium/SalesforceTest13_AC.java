package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceTest13_AC extends Browserutility{

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(2000);
		WebElement alltab=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		alltab.click();
		Thread.sleep(3000);
		WebElement account=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitforvisiblity(account);
		account.click();
		Thread.sleep(3000);
		WebElement closebtn = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		closebtn.click();
		Thread.sleep(1000);
		WebElement creatN_AC=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitforvisiblity(creatN_AC);
		creatN_AC.click();
		Thread.sleep(1000);
		WebElement veiwName=driver.findElement(By.xpath("//input[@id='fname']"));
		waitforvisiblity(veiwName);
		veiwName.sendKeys("jhhds");
		Thread.sleep(2000);
		WebElement veiwUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		waitforvisiblity(veiwUniqueName);
		veiwUniqueName.sendKeys("khjdsd");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		waitforvisiblity(save);
		save.click();
		Thread.sleep(3000);
	
		WebElement edit=driver.findElement(By.xpath("//a[@xpath='1']"));
		//WebElement edit = driver.findElement(By.cssSelector("body.hasMotif.accountTab.overviewPage.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr.ext-linux:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.filterOverview:nth-child(3) form:nth-child(1) div.bFilterView span.bFilter span.fFooter:nth-child(3) > a:nth-child(1)"));
		waitforvisiblity(edit);		
		edit.click();
		Thread.sleep(2000);
		WebElement vname=driver.findElement(By.xpath("//input[@id='fname']"));
		vname.sendKeys("Priti");
		Thread.sleep(2000);
		WebElement vunqName=driver.findElement(By.xpath("//input[@id='devname']"));
		vunqName.sendKeys("123");
		Thread.sleep(2000);
		WebElement feild=driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select dpdwn = new Select(feild);	
		dpdwn.selectByVisibleText("Account Name");
		Thread.sleep(2000);
		WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
		waitforvisiblity(operator);
		Select dpdwn1 = new Select(operator);
		dpdwn1.selectByVisibleText("contains");
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
		waitforvisiblity(value);
		value.sendKeys("a");
		Thread.sleep(2000);
		WebElement save1=driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
		save1.click();
	////NOT COMPLTED	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
