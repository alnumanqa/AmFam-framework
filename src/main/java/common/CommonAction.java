package common;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reporting.Logs;


public class CommonAction {

	public static void clickElement(WebElement element) {
		try {
			element.click();
			Logs.log(element + " <-----> has been clicked"); // Here WebElement type converted to String type, String+String
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found");
			Assert.fail();
		}
		

	}

	public static void inputText(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + "has been written in the field");

		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found, so couldn't put the value" + element);
			Assert.fail();
		}

	}

}

