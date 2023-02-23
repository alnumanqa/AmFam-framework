package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "SiteHeader__logo-img")
	WebElement logo;

	// (//button[@class='SiteHeader__submenu-toggle a _hover-underline'])[1]
	@FindBy(css = "button.SiteHeader__submenu-toggle.a._hover-underline")
	WebElement signin01;

	@FindBy(xpath = "//span[text()=' Sign In ']")
	WebElement signin02;

	@FindBy(css = "input#uid_56")
	WebElement userId;

	@FindBy(css = "input#uid_61")
	WebElement password;

	@FindBy(css = "span.Selection__control._checkbox")
	WebElement rememberUserIdCheckBox;

	public void clickLogo() throws InterruptedException {
		clickElement(logo);
		Thread.sleep(3000);
	}

	public void clickSignIn01() throws InterruptedException  {
		clickElement(signin01);
		Thread.sleep(3000);
	}

	public void clickSignin02() throws InterruptedException {
		clickElement(signin02);
		Thread.sleep(2000);
	}

	public void clickUserId() throws InterruptedException {
		clickElement(userId);
		Thread.sleep(3000);
	}

	public void inputTextInUserIdField() throws InterruptedException {
		inputText(userId, "Numan");
		Thread.sleep(3000);
	}

	public void inputTextInPasswordField() throws InterruptedException {
		inputText(password, "451554");
		Thread.sleep(3000);
	}

	public void clickRememberUserIdCheckBox() throws InterruptedException {
		clickElement(rememberUserIdCheckBox);
		Thread.sleep(3000);
	}
	

}
