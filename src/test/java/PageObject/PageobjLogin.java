package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseClass;

public class PageobjLogin extends BaseClass {
	
	@FindBy(name="username")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	public static WebElement getdashtext;

}
