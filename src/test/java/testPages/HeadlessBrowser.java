package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); // FirefoxOptions for Firefox headless
		options.addArguments("--headless"); // also we can run in incognito
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(3000);
		System.out.println("The Current URL is: "+driver.getCurrentUrl());	
		System.out.println("Test execution completed");
		driver.quit();
	}

}
