package Base;

import java.io.File;
import java.io.FileReader;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import Utils.Reporter1;

import org.apache.logging.log4j.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.*;

public class BaseClass extends Reporter1  {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static final Logger logger = LogManager.getLogger(BaseClass.class);
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void startapp() throws IOException  {
		if(driver==null) {
		  fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\config.properties");
			prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome ")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PropertyConfigurator.configure("C:\\Users\\navee\\eclipse-workspace\\New space\\HybridProject\\src\\test\\resources\\log4j2.properties");
			
		}
		
	}
	public static String takesc(String filename) throws IOException  {
	  TakesScreenshot tak = (TakesScreenshot) driver;
	  File Sourcefile =	tak.getScreenshotAs(OutputType.FILE);
	  File  destination = new File(System.getProperty("user.dir")+"//src//test//resources//Screenshots//"+filename+".png");
	  FileUtils.copyFile(Sourcefile, destination);
	  return destination.getAbsolutePath();
	}
	
	
	@AfterTest
     public void closeapp() {
    	 driver.close();
		
	}


}
