package Testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseClass;
import PageObject.PageobjContactupdate;
import PageObject.PageobjLogin;

public class ContactTestcase extends BaseClass {
	
	@BeforeTest
	public void setvalues() {
		testCaseName = "TC002 Contact page verification ";
		testDescription = "Verify the user is able to login and update the contact details";	
	}
	@Test
	public void contactcase() throws IOException {
		PageFactory.initElements(driver, PageobjLogin.class);
		
		PageobjLogin.username.sendKeys(prop.getProperty("username"));
		test.info("User has entered the username");
		PageobjLogin.password.sendKeys(prop.getProperty("password"));
		test.info("User has entered the password");
		PageobjLogin.loginbutton.click();
		test.info("User has clicked the login button");
		String pagetext = PageobjLogin.getdashtext.getText();
		if (pagetext.equalsIgnoreCase("Dashboard")) {
			Assert.assertTrue(true);
			logger.info("Verified successfully");
			test.addScreenCaptureFromPath(takesc("Dashboard"), "Verified success");
			
			test.log(Status.PASS, "Verified page text success");
			test.info("User has verified the login page");
			
		} else {
			Assert.assertTrue(false);
			logger.info("Not Verified ");
			test.log(Status.FAIL, "Verified page text success");
			test.addScreenCaptureFromPath(takesc("Dashboard"), "Not Verified ");
			
		}

		PageFactory.initElements(driver, PageobjContactupdate.class);

		PageobjContactupdate.infoicon.click();
		logger.info("Info icon clicked ");
		test.info("User has clicked the info icon");
		PageobjContactupdate.contactlink.click();
		logger.info("Contact link clicked ");
		test.info("User has clicked the Contact link button");
		PageobjContactupdate.Street1.clear();
		PageobjContactupdate.Street1.sendKeys("kpk");
		logger.info("Enterted street name ");
		test.info("User has Entered the Street name");
		PageobjContactupdate.city.clear();
		PageobjContactupdate.city.sendKeys("Ponneri");
		logger.info("Enterted city name ");
		test.info("User has Entered the City name");
		PageobjContactupdate.state.clear();
		PageobjContactupdate.state.sendKeys("Tamil nadu");
		logger.info("Enterted state name ");
		test.info("User has Entered the State name");
		PageobjContactupdate.save.click();
		logger.info("Save button clicked ");
		test.info("User has Clicked the Save button");
		test.addScreenCaptureFromPath(takesc("Save message"), "Verified success");
		test.log(Status.PASS, "Verified Success Contact updated");

	}

}
