package baseUtil;

import static utils.IConstant.*;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	Configuration configuration;

	@BeforeMethod
	public void setUp() {
		/*
		 * 1st way, to show the location of chrome driver
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\numan\\eclipse-workspace\\com.amfam\\driver\\chromedriver.exe");
		 */

		/*
		 * 2nd way, to show the location of chrome driver
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "/driver/chromedriver.exe");
		 */

		// 3rd way, to show the location of chrome driver
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// If you wanna use gecko driver, you must have firefox browser in your system
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		// driver = new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// driver = new EdgeDriver();

		// 108.0.5359.71 -- current version, it always changed, so use it
		// 108.0.5359.22 -- older version
		// 107.0.5304.62 -- older version from above
		// older version sometimes used for stability of browser, sometime for the
		// request of Authority
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated
		// version
		// WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
		// driver = new ChromeDriver();

		// WebDriverManager is used for most updated firefoxdriver()
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		configuration = new Configuration();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.get("https://www.amfam.com/");
		// we are calling url from properties file
		driver.get(configuration.getProperty((URL)));
		// convert String to long
		long pageLoadTime = Long.parseLong(configuration.getProperty(PAGELOAD_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		long implicitlyWait = Long.parseLong(configuration.getProperty(IMPLICITLY_WAIT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		homePage = new HomePage(driver);
	}
	

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
