package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObject.PageobjLogin;
import Utils.Readxldata;

public class LoginTest extends BaseClass  {
	
	@BeforeTest
	public void setvalues() {
		testCaseName = "TC001 Login page verification ";
		testDescription = "Verify the user is able to login with valid and invalid credentitals";
		
	}
	@Test(dataProviderClass=Readxldata.class, dataProvider = "fetch")
	public static void logincase(String username, String password) {
		PageFactory.initElements(driver, PageobjLogin.class);
		PageobjLogin.username.sendKeys(username);             //sendKeys(prop.getProperty("username"));
		logger.info("User name entered");
		PageobjLogin.password.sendKeys(password);   
		logger.info("Password entered");                      //sendKeys(prop.getProperty("password"));
		PageobjLogin.loginbutton.click();
		logger.info("Clicked the button");
	    
	}

}
