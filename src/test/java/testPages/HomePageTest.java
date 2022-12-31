package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 1)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}

	@Test(enabled = false, priority = 2)
	public void clickSignin01test() throws InterruptedException {
		homePage.clickSignIn01();
	}

	@Test(enabled = false, priority = 3)
	public void clickSignin02test() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.clickSignin02();
	}

	@Test(enabled = false, priority = 4)
	public void inputTextInUserIdFieldTest() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.inputTextInUserIdField();
	}

	@Test(enabled = false, priority = 5)
	public void inputTextInPasswordField() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.inputTextInPasswordField();
	}

	@Test(enabled = false, priority = 6)

	public void clickRememberUserIdCheckBoxTest() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.clickRememberUserIdCheckBox();
	}

	@Test(enabled = false, priority = 7)
	public void signinFunctionlityTest() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.inputTextInUserIdField();
		homePage.inputTextInPasswordField();
		homePage.clickRememberUserIdCheckBox();
		homePage.clickSignin02();
	}

	@Test(enabled = false, priority = 8)
	public void useOfLinkTextAsLocator() throws InterruptedException {
		driver.findElement(By.linkText("Claims")).click();
		Thread.sleep(2000);
	}

	@Test(enabled = false, priority = 9)
	public void useOfPartialLinkTextAsLocator() throws InterruptedException {
		driver.findElement(By.partialLinkText("Customer Sup")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 10)
	public void useOfSendKeys() throws InterruptedException {
		driver.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("Nazif");
		Thread.sleep(3000);
	}
	
	//HW3 starts from Here.
	@Test(enabled = false)
	public void use_of_isDisplayed_in_logo_image() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("img.SiteHeader__logo-img")).isDisplayed();
		System.out.println("Is the LOGO displayed? ans: " + elementDisplayed);
	}

	@Test(enabled = false)
	public void use_of_isEnabled_in_signin_button() throws InterruptedException {
		homePage.clickSignIn01();
		Thread.sleep(4000);
		boolean elementIsEnabled = driver.findElement(By.cssSelector("span.LoadingButton__content")).isEnabled();
		System.out.println("Is signin button enabled? ans: " + elementIsEnabled);
	}

	@Test(enabled = false)
	public void use_of_isSelected_in_remember_userID_checkbox() throws InterruptedException {
		homePage.clickSignIn01();
		Thread.sleep(4000);
		boolean elementIsSelected = driver.findElement(By.cssSelector("span.Selection__control._checkbox"))
				.isSelected();
		System.out.println("Is User Id checkbox selected? ans: " + elementIsSelected);
	}

	@Test(enabled = false)
	public void use_of_getTitle_and_getURL_in_insurance_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='a-standalone' and text()='Insurance']")).click();
		Thread.sleep(3000);
		System.out.println("Title of the page: " + driver.getTitle());
		System.out.println("The current URL of the page: " + driver.getCurrentUrl());
	}

	@Test(enabled = false)
	public void use_of_getText_in_insurance_page() throws InterruptedException {
		WebElement insurance = driver.findElement(By.xpath("//a[@class='a-standalone' and text()='Insurance']"));
		Thread.sleep(3000);
		System.out.println("Text for the Webelement: " + insurance.getText());
	}

	@Test(enabled = false)
	public void use_of_getAttribute_method() {
		String logo = driver.findElement(By.cssSelector("img.SiteHeader__logo-img")).getAttribute("class");
		System.out.println("The value of the attribute is: " + logo);
	}

	@Test(enabled = true)
	public void use_of_clear_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uid_56")).sendKeys("Car");
		Thread.sleep(5000);
		//navigate().back() would not work here
		//driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("uid_56")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("uid_56")).sendKeys("HomeOwner");
		Thread.sleep(3000);
	}


}
