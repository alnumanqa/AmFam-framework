package testPages;

import org.openqa.selenium.By;
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
		;
	}

}
