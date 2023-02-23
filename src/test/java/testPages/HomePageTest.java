package testPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	// Dimension dimension;
	// Actions actions;
	// Select select;

	@Test(enabled = true, priority = 1, invocationCount = 3)
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

	@Test(enabled = false, priority = 10)
	public void useOfSendKeys() throws InterruptedException {
		driver.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("Nazif");
		Thread.sleep(3000);
	}

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

	@Test(enabled = false)
	public void use_of_clear_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uid_56")).sendKeys("Car");
		Thread.sleep(5000);
		// navigate().back() would not work here
		// driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("uid_56")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("uid_56")).sendKeys("HomeOwner");
		Thread.sleep(3000);
	}

	// Hw4 starts here.
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
		//List<WebElement> list = new ArrayList<>();
		//select.getAllSelectedOptions();
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
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void useOfLoggerTest() throws InterruptedException {
		homePage.useOfLogger();
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
		WebElement userid = driver.findElement(By.cssSelector("input#uid_67"));
		WebElement password = driver.findElement(By.cssSelector("input#uid_72"));
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

	@Test(enabled = false)
	public void use_of_explicitly_wait02() throws InterruptedException {
		WebElement startAquote = driver.findElement(By.xpath("//button[normalize-space(text())='Start a New Quote']"));
		wait.until(ExpectedConditions.visibilityOf(startAquote)).click();
		Thread.sleep(4000);
//		WebElement startAquote01 = driver.findElement(By.xpath("//button[normalize-space(text())='Start a New Quote']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", startAquote01);
//		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_robot_class_to_scroll_up_and_down() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
	}

	// scroll Into View The Element
	// This is important, standard question
	@Test(enabled = false)
	public void scrollIntoViewTheElement() throws InterruptedException {
		WebElement sitemap = driver.findElement(By.xpath("//a[text()='Sitemap']"));
		js.executeScript("arguments[0].scrollIntoView(true);", sitemap);
		Thread.sleep(3000);

	}

	// How to handle web based pop up
	@Test(enabled = false)
	public void web_based_alert_accept_test() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void web_based_alert_popup_dismiss_test() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);

	}

	// How to handle authentication pop up
	@Test(enabled = false)
	public void authenticationPopUpTest() throws InterruptedException {
		String userName = "admin";
		String passoward = "admin";
		// adding user name, password with URL
		// original one is: "https://the-internet.herokuapp.com/basic_auth";
		// Updated one is: "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		String url = "https://" + userName + ":" + passoward + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.navigate().to(url);
		Thread.sleep(6000);
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("Text is: " + text);

	}

	// How to handle right click
	@Test(enabled = false)
	public void use_of_right_click_action_test() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		WebElement rcButton = driver.findElement(By.xpath("//button[text()='Right Click Three']"));
		actions.moveToElement(rcButton).contextClick().build().perform();
		Thread.sleep(3000);

		// Not part of the double click action
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);

	}

	// How to handle double click
	@Test(enabled = false)
	public void use_of_double_click_action_test() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		WebElement dcButton = driver.findElement(By.xpath("//button[text()='Double Click Three']"));
		actions.doubleClick(dcButton).build().perform();
		Thread.sleep(3000);
		// Not part of the double click action
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	// important for interview
	@Test(enabled = false)
	public void use_of_right_click_action() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement rcButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.moveToElement(rcButton).contextClick().build().perform(); // to do the right click, contextClick() is
																			// used
		Thread.sleep(4000);

		// Just keep below code, Can't find the web element for Edit at present, the
		// line 968 is from my collection.
		// Below 2 is not relevant to right click, just doing some extra, which we know
		// already
		// Next: I want to click on Edit link on the displayed menu options
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		Thread.sleep(5000);
		edit.click(); // a regular click , not a right click
		Thread.sleep(5000);

		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	// important for interview
	@Test(enabled = false)
	public void use_of_double_click_action() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dcButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(dcButton).build().perform();
		Thread.sleep(5000);

		// Not part of the double click action
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	// not important for interview
	@Test(enabled = false)
	public void use_of_drag_and_drop_action() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Element which needs to drag (Bank)
		WebElement sourceLocator = driver.findElement(By.id("credit2"));
		// Element where need to be dropped.(In 'Account' field of debit side)
		WebElement targetLocator = driver.findElement(By.xpath("//ol[@id='bank']"));
		// We Use Actions class for drag and drop.
		actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(4000);
	}

	// not important
	@Test(enabled = false)
	public void use_of_slider_action() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://demoqa.com/slider/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Retrieve WebElemnt 'slider' to perform mouse hover
		// This is the field where volume is increased
		WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		Thread.sleep(5000);
		// to test the slider is working or not
		// dragAndDrop (int xoffset, int yoffset)
		actions.dragAndDropBy(slider, 50, 0).build().perform(); // learn from here, 80 is in pixel which might not match
																// with real volume change
		Thread.sleep(5000);
		// slider.click();
		System.out.println("Moved slider in horizontal directions");
	}

	// not important (alternate)
	@Test(enabled = false)
	public void use_of_slider_action_alternate() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://demoqa.com/slider/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Retrieve WebElemnt 'slider' to perform mouse hover
		// This is the field where volume is increased
		WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		Thread.sleep(5000);
		actions.clickAndHold(slider);
		actions.moveByOffset(65, 0).build().perform();
		Thread.sleep(5000);
		System.out.println("Moved slider in horizontal directions");
	}

	@Test(enabled = false)
	public void mouseHoverActionOnAboutUs() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement aboutUs = driver
				.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		actions.moveToElement(aboutUs).build().perform();
		Thread.sleep(5000);

		List<WebElement> listofAboutUs = driver.findElements(
				By.xpath("//a[normalize-space(text())='About Us']//following-sibling::div//child::div//child::div"));
		int numberOfElements = listofAboutUs.size();
		System.out.println("Number of web Elements: " + numberOfElements);
		for (int i = 0; i < numberOfElements; i++) {
			System.out.println(listofAboutUs.get(i).getText());
		}

		// a[contains(text(), 'About
		// Us')]//following-sibling::div//child::div//child::div
		// a[contains(text(), 'Patient
		// Care')]//following-sibling::div//child::div//child::div
		// a[contains(text(), 'Our
		// Locations')]//following-sibling::div//child::div//child::div
	}

	// use of getWindowHandel()

	@Test(enabled = false)
	public void switchBetweenWindow01() throws InterruptedException {
		driver.get("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		WebElement openWindow = driver.findElement(By.xpath("(//button[text()='Open Window'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", openWindow);
		Thread.sleep(3000);
		String ParentWindow = driver.getWindowHandle();
		System.out.println("parent window id " + ParentWindow);
		WebElement window01 = driver.findElement(By.xpath("(//button[text()='Open Window'])[1]"));
		js.executeScript("arguments[0].click()", window01);
		Thread.sleep(5000);
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("Window open after click " + allWindow);
		String parent = (String) allWindow.toArray()[0];
		String child = (String) allWindow.toArray()[1];
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());

	}

	// different way for moving from child to window for different url
	@Test(enabled = false)
	public void switchBetweenWindow03() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://enthrallit.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(3000);

		// This will scroll up the page by 1000 pixel vertically
		Thread.sleep(4000); // used to see the scroll
		js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
		Thread.sleep(4000);

		String mainWindow = driver.getWindowHandle(); // learn this line
		System.out.println("Main Window ID: " + mainWindow + "\n");

		// click on the Open Window button
		driver.findElement(By.xpath("(//button[text()='Open Window'])[1]")).click();
		Thread.sleep(5000);

		// interview question: How you handle windows from parent to child? or how you
		// can recognize the parent and child window

		// Get all window handles -- include parent + child
		// why we are using set? because we don't want duplicate, and set doesn't allow
		// duplicate
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Total Windows Open: " + allWindowHandles.size());

		// for each loop
		for (String wh : allWindowHandles) {
			if (mainWindow.equals(wh)) {
				System.out.println("\t Window ID 1: \t" + wh + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			} else {
				driver.switchTo().window(wh);
				System.out.println("\t Window ID 2: \t" + wh + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			}
		}

	}

	// How to read the content of a Table
	@Test(enabled = false)
	public void read_table() throws InterruptedException {
		driver.get("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//table[@id='dtHorizontalVerticalExample']"));
		js.executeScript("arguments[0].scrollIntoView();", table);
		Thread.sleep(3000);
		System.out.println(table.getText());
		Thread.sleep(3000);
	}

	// How to read a cell of a Table
	@Test(enabled = false)
	public void readAnyCellOfARowofTheTable() throws InterruptedException {
		driver.get("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//table[@id='dtHorizontalVerticalExample']"));
		js.executeScript("arguments[0].scrollIntoView();", table);
		Thread.sleep(3000);
		WebElement cell = driver.findElement(By.xpath("//td[@class='sorting_1' and text()='Airi']"));
		System.out.println(cell.getText());

	}

	// Tough, don't try to understand the code, just understand the concept:
	// time+condition+frequency
	// Interview question, generally not used in industry
	@Test(enabled = false)
	public void logoTest04() throws InterruptedException {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class); // line ends here
		WebElement logo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(
						"//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
			}
		});
		logo.isDisplayed();
	}

	@Test(enabled = false, priority = 1, groups = { "functionalTest", "sanityTest", "smokeTest", "regressionTest" })
	public void use_of_getTitle_method_with_assertion1() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");
		// Hard Assertion will not go to next line of failed, but move to next line when
		// passed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);

	}

	@Test(enabled = false)
	public void use_of_expectedExceptions01() {
		System.out.println("We can verify whether a code throws the expected exception or not. Here it will fail");
		int i = 1 / 0;
	}

	@Test(enabled = false, expectedExceptions = ArithmeticException.class)
	public void use_of_expectedExceptions02() {
		System.out.println("We can verify whether a code throws the expected exception or not. Here it will pass");
		int i = 1 / 0;
	}

	@Test(enabled = false, expectedExceptions = NoSuchElementException.class)
	public void use_of_expectedExceptions03() throws InterruptedException {
		driver.findElement(By.id("ms-login-submit")).click();
		Thread.sleep(3000);
	}

	// use of invocation count, when? -- if you know some test cases fail for no
	// reason
	// and then you fix it, you can run more than one time by invocation count
	// use of threadPoolSize
	@Test(enabled = false, priority = 1, invocationCount = 10, timeOut = 10000)
	public void titleTest04() {
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("Home Page Title is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
		System.out.println("Thread: " + Thread.currentThread().getName()); // to know which thread is running

	}

	// TODO Is the threadPoolSize working? NEED TO RESOLVED, may be working as multi
	// threaded, can't see, need to be make sure
	// Ask Nasir to solve it
	@Test(enabled = false, priority = 1, threadPoolSize = 3, timeOut = 10000)
	public void titleTest() {
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("Home Page Title is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
		System.out.println("Thread: " + Thread.currentThread().getName()); // to know which thread is running

	}

	@Test(enabled = false)
	public void b_logoTest01() {
		WebElement logo = driver.findElement(By
				.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");
	}

	@Test(enabled = false, dependsOnMethods = "b_logoTest01")
	public void a_newUserRegistrationTest01() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	// change the logoTest02 method to fail and see the above method skipped as it
	// depends on logoTest02

	@Test(enabled = false)
	public void b_logoTest02() {
		// the xpath is wrong
		WebElement logo = driver.findElement(By.xpath(
				"//mmem[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");
	}

	@Test(enabled = false, dependsOnMethods = "b_logoTest02")
	public void a_newUserRegistrationTest02() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	// change the logoTest02 method to fail and see the above method skipped as it
	// depends on logoTest02

	// Explain in the next class, forgot to add
	@Test(enabled = false, groups = { "functionalTest" })
	public void nonSkipHomePageTitleTest() {
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("home page title is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match...");
		System.out.println("No need to skip the test");
	}

	// only example where throw is used
	// How to skip a test?
	@Test(enabled = false, groups = { "functionalTest" })
	public void skipHomePageTitleTest01() {
		String title = "CMS Enterprise Portal";
		if (title.equals(driver.getTitle())) {
			throw new SkipException("Skipping -- as the title matches as expected");
		} else {
			System.out.println("Home Page Title doesn't match...");
		}
		System.out.println("I am out of the if else condition");
	}

	@Test(enabled = false, groups = { "functionalTest" })
	public void skipHomePageTitleTest02() {
		// expected is different than actual
		String title = "CMS Enterprise Portal                      ";
		if (title.equals(driver.getTitle())) {
			throw new SkipException("Skipping -- as the title matches as expected");
		} else {
			System.out.println("Home Page Title doesn't match...");
		}
		System.out.println("I am out of the if else condition");
	}

	@Test(enabled = false)
	public void takeScreenShot() {
		// TakesScreenshot ts = (TakesScreenshot)driver;
	}

}
