package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObject.PageLogout;
import PageObject.PageobjLogin;

public class LogoutTestcase extends BaseClass {
	@BeforeTest
	public void setvalues() {
		testCaseName = "TC003 Logout verification ";
		testDescription = "Verify the user is able to log out ";

	}

	@Test
	public void logout() {
		PageFactory.initElements(driver, PageobjLogin.class);

		PageobjLogin.username.sendKeys(prop.getProperty("username"));
		test.info("User has entered the username");
		PageobjLogin.password.sendKeys(prop.getProperty("password"));
		test.info("User has entered the password");
		PageobjLogin.loginbutton.click();
		test.info("User has clicked the login button");
		
		PageFactory.initElements(driver, PageLogout.class);
		
		PageLogout.logoutbtn.click();
		PageLogout.clicklogout.click();
		test.info("User has logged out from the application");
	}

}
