package selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report_utility {
	static ExtentReports report;
	static ExtentTest logger;

	static void CreatReport() {
		String UniqueDnT = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm''").format(new Date());
		String filepath = System.getProperty("user.dir") + "//ExtentReport//SampleReport_" + UniqueDnT + ".html";
		report = new ExtentReports(filepath);
	}

	static void CreatTest(String TestcaseName) {
		logger = report.startTest(TestcaseName);
	}

	static void EndTestCase() {
		report.endTest(logger);
	}

	static void EndReport() {
		report.flush();
	}

}
