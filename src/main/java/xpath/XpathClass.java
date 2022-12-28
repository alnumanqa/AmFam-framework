package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XpathClass {
	// Created xpath by text
	@FindBy(xpath = "//a[text()='Find an Agent']")
	WebElement findAAgent01;
	@FindBy(xpath = "//a[ text()='Resources']")
	WebElement resources01;
	@FindBy(xpath = "//span[text()=' Sign In ']")
	WebElement signInButton;
	@FindBy(xpath = "//a[text()='User ID']")
	WebElement forgetUserId;
	@FindBy(xpath = "//a[text()='Password']")
	WebElement forgetPassword;
	@FindBy(xpath = "//a[text()='Contact Us' and @class='a-standalone']")
	WebElement contactUs;

	// Created xpath by ID
	@FindBy(xpath = "//input[@id='uid_56']")
	WebElement userId;
	@FindBy(xpath = "//input[@id='uid_162']")
	WebElement passoward;
	@FindBy(xpath = "//input[@id='uid_105']")
	WebElement zipcodeo1;

	// Created xpath by multiple value using and
	@FindBy(xpath = "//a[@class='a-standalone' and text()='Insurance']")
	WebElement insurance01;
	@FindBy(xpath = "//a[@class='a-standalone' and text()='Claims']")
	WebElement claims01;
	@FindBy(xpath = "//a[@class='a-standalone' and text()='Customer Support']")
	WebElement customerSupport01;
	@FindBy(xpath = "//a[@class='a-standalone' and text()='Resources']")
	WebElement resources02;
	@FindBy(xpath = "//span[@class='QuoteRequest__header-phone']")
	WebElement phoneNumber;

	// Creating xpath by class
	@FindBy(xpath = "//img[@class='SiteHeader__logo-img']")
	WebElement logo;
	@FindBy(xpath = "//span[@class='Selection__control _checkbox']")
	WebElement rememberUserIdBox;
	@FindBy(xpath = "//span[@class='LoadingButton__content']")
	WebElement letsGobutton;

	// Creating xpath by name
	@FindBy(xpath = "//input[@name='zipCode']")
	WebElement zipcode02;
	
	
	//Creating xpath by cointains method
	@FindBy(xpath = "//a[contains(text(), 'Customer')]")
	WebElement customerSupport02;
	@FindBy(xpath = "//a[contains(text(), 'Insur')]")
	WebElement insurance02;
	@FindBy(xpath = "//a[contains(text(), 'Cl')]")
	WebElement claims02;
	@FindBy(xpath = "//a[contains(text(), 'Res')]")
	WebElement resources03;
	@FindBy(xpath = "//a[contains(text(), 'Find')]")
	WebElement findAAgent02;

	// Created xpath by multiple value using or
	@FindBy(xpath = "//span[@class='SelectionTiles__tile-cta' or text()=' Condo ']")
	WebElement condo;
	@FindBy(xpath = "//span[@class='SelectionTiles__tile-cta' or text()=' Car ']")
	WebElement car;
	@FindBy(xpath = "//span[@class='SelectionTiles__tile-cta' or text()=' Home ']")
	WebElement Home;
	@FindBy(xpath = "//span[@class='SelectionTiles__tile-cta' or text()=' Life ']")
	WebElement life;
	@FindBy(xpath = "//span[@class='SelectionTiles__tile-cta' or text()=' Business ']")
	WebElement business;

}
