package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseClass;

public class PageobjContactupdate extends BaseClass {
	
	@FindBy(xpath="//*[text()='My Info']")
	public static WebElement infoicon;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	public static WebElement contactlink;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	public static WebElement Street1;
	
	@FindBy (xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	public static WebElement city;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	public static WebElement state;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	public static WebElement save;

}
