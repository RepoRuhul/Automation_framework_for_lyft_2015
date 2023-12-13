package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {// Why default type is not ok for below 2 line?
	// because different package accessibility is not possible for default type
	public WebDriver driver; // or we can use protected type
	public HomePage homePage; // or we can use protected type

	// Before start a test what need to do?
	@BeforeMethod
	public void setUP() {
		// First job is to recognize the location of driver from your device
		// right click on chromedriver.exe --- properties -- copy the location an paste
		// below
		// System is a class and setProperty is a method of System Class
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ruhul\\eclipse-workspace\\com.lyft\\driver\\chromedriver.exe");
		// We instantiated the driver here
		driver = new ChromeDriver();
		// maximize method is used to maximize the window
		driver.manage().window().maximize();
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		// get method is used to get the targeted url
		driver.get("https://www.lyft.com/");
		// PageLoadTimeout is used to wait to load the page for curtain amount of time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// Implicitly wait is used to wait for each web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);// can you explain this line for me please?
	}

	@AfterMethod
	public void tearUp() {// tearUp method na diye onno method diley problem hoto kina?
		driver.quit();
	}

}
