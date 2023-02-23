package testPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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
	
	@Test(enabled = false)
	public void useOfEnter() throws InterruptedException {
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uid_56")).sendKeys("Car", Keys.ENTER);
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void useOfReturn() throws InterruptedException {
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uid_56")).sendKeys("Life Insurance", Keys.RETURN);
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void useOfNavigateMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.statefarm.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	// HW5 starts from here

	@Test(enabled = false)
	public void use_of_set_specific_size_in_window() throws InterruptedException {
		Thread.sleep(3000);
		dimension = new Dimension(900, 500);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		driver.navigate().to("https://www.statefarm.com/");
		Thread.sleep(3000);
		System.out.println("Size of the set screen: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Size of the maximize screen: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		System.out.println("Size of the set screen: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println("Size of the Fullscreen: " + driver.manage().window().getSize());

	}

	@Test(enabled = false)
	public void useOfHardAssert01() {
		WebElement startANewQuote = driver
				.findElement(By.xpath("//button[normalize-space(text())='Start a New Quote']"));
		boolean flag = startANewQuote.isDisplayed();
		System.out.println("Is startANewQuote displayed: " + flag);
		Assert.assertTrue(true, "Start a new quote is not displayed");
	}

	@Test(enabled = false)
	public void useOfHardAssert02() throws InterruptedException {
		String expected = "Auto, Home, Life, & More | American Family Insurance";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		Assert.assertEquals(actual, expected, "Homepage title does not match");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.className("SiteHeader__logo-img"));
		boolean displayed = logo.isDisplayed();
		System.out.println("Is Logo displayed: " + displayed);
		Assert.assertTrue(true, "Logo not displayed");
	}

	// First part of the test case will fail. Since I am using hard assertion, then
	// the execution will stop too.
	@Test(enabled = false)
	public void useOfHardAssert03() throws InterruptedException {
		String expected = "Auto, Home, Life, amp& More | American Family Insurance";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		Assert.assertEquals(actual, expected, "Homepage title does not match");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.className("SiteHeader__logo-img"));
		boolean displayed = logo.isDisplayed();
		System.out.println("Is Logo displayed: " + displayed);
		Assert.assertTrue(true, "Logo not displayed");
	}

	// Using soft assertion
	// First part of the test case will fail. Since I am using soft assertion, then
	// the execution will continue.
	@Test(enabled = false)
	public void useOfHardAssert04() throws InterruptedException {
		String expected = "Auto, Home, Life, amp& More | American Family Insurance";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Homepage title does not match");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.className("SiteHeader__logo-img"));
		boolean displayed = logo.isDisplayed();
		System.out.println("Is Logo displayed: " + displayed);
		softAssert.assertTrue(true, "Logo not displayed");
	}

	// using of mouse hover over action
	@Test(enabled = false)
	public void useofHoverAction01() throws InterruptedException {
		// To do the mouse hover action, we use Actions class
		actions = new Actions(driver);
		WebElement insurance = driver.findElement(By.xpath("//a[text()='Insurance']"));
		Thread.sleep(3000);
		actions.moveToElement(insurance).build().perform();// this syntax interview question
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void useOfHoverAction02() throws InterruptedException {
		actions = new Actions(driver);
		WebElement claims = driver.findElement(By.linkText("Claims"));
		Thread.sleep(4000);
		actions.moveToElement(claims).build().perform();
		Thread.sleep(4000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// here - using selectByIndex() method
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one change the index
	// number

	@Test(enabled = false)
	public void useOfDropDown_by_index_Method() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement01 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		select = new Select(dropElement01);
		select.selectByIndex(4);
		Thread.sleep(3000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()

	@Test(enabled = false)
	public void useOfDropDown_by_visual_text() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement02 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		select = new Select(dropElement02);
		select.selectByVisibleText("Appliances");
		Thread.sleep(3000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled = false)
	public void useOfDropDown_by_value() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement03 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		select = new Select(dropElement03);
		select.selectByValue("search-alias=mobile-apps");
		Thread.sleep(3000);
	}

	// HW6 starts here
	@Test(enabled = false)
	public void Use_of_loggerTest01() throws InterruptedException {
		homePage.clickSignIn01();
	}

	@Test(enabled = false)
	public void Use_of_loggerTest02() throws InterruptedException {
		homePage.clickSignIn01();
		homePage.inputTextInUserIdField();
	}

	@Test(enabled = false)
	public void click_by_javascriptExecutor() throws InterruptedException {
		WebElement singninButton = driver
				.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline"));
		js.executeScript("arguments[0].click()", singninButton);
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void inputText_by_javascriptExecutor() throws InterruptedException {
		WebElement singninButton = driver
				.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline"));
		js.executeScript("arguments[0].click()", singninButton);
		Thread.sleep(4000);
		WebElement userid = driver.findElement(By.cssSelector("input#uid_56"));
		WebElement password = driver.findElement(By.cssSelector("input#uid_61"));
		js.executeScript("arguments[0].value='Numan'", userid);
		Thread.sleep(4000);
		js.executeScript("arguments[0].value='1234'", password);
		Thread.sleep(4000);
		WebElement checkbox = driver.findElement(By.cssSelector("span.Selection__control._checkbox"));
		js.executeScript("arguments[0].click()", checkbox);
		Thread.sleep(4000);
		Assert.assertTrue(true, "Webelement not found");
		WebElement signinButton2 = driver.findElement(By.className("LoadingButton__content"));
		js.executeScript("arguments[0].click()", signinButton2);
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void handleing_hidden_element() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("button#formButton3")).sendKeys("Numan",
		// Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Hide / Show' and @id='formButton3']")).click();
		Thread.sleep(3000);
		WebElement hideElement1 = driver.findElement(By.xpath("//button[text()='Hide / Show' and @id='formButton3']"));
		js.executeScript("arguments[0].value='numan'", hideElement1);
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_actions_class() throws InterruptedException {
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_javascriptExecutor() throws InterruptedException {
		js.executeScript("window.scrollBy(0, 2500)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -1500)", "");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_explicitly_wait() throws InterruptedException {
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[normalize-space(text())='Start a New Quote']"))).click();
		Thread.sleep(4000);
	}

	@Test(enabled = true)
	public void use_of_explicitly_wait02() throws InterruptedException {
		WebElement startAquote = driver.findElement(By.xpath("//button[normalize-space(text())='Start a New Quote']"));
		wait.until(ExpectedConditions.visibilityOf(startAquote)).click();
		Thread.sleep(4000);
	}

}
