package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot_demo extends Browserutility {

	public static void main(String[] args) throws Exception {
		launchbrwsr("ch");
		loginto();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		String pathdestinationimage = System.getProperty("user.dir")+"//ScreenShot//" + new SimpleDateFormat("'image_'YYYYMMddHHmm'.png'").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(pathdestinationimage);
		FileUtils.copyFile(source, destination);
		quitBrowser();
		
		
	}

}
