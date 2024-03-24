package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter1 {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test, node;
	public String testCaseName, testDescription;
	
	
	
	@BeforeSuite
	public void startreport() {
	     extent = new ExtentReports();
		 reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\report.html");
		 reporter.loadXMLConfig("C:\\Users\\navee\\eclipse-workspace\\New space\\HybridProject\\src\\test\\resources\\Configfiles\\extend-config.xml");
		 reporter.setAppendExisting(false);
		 extent.attachReporter(reporter);
		 
		
	}
	
	@BeforeClass
	public void report() {
		test = extent.createTest(testCaseName, testDescription);
	}
   

	
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
}
