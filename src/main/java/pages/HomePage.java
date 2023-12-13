package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory help to instantiate WebElements
		PageFactory.initElements(driver, this);// can you explain this line please????????
	}

	// 1st way: Most common way to write the WebElement (@FindBy), you must know how
	// to do that
	// Use of unique 'Id' attribute as locator

	// 2nd way to write the WebElement: not common, here I used for the 'password'

	// FYI: Never take a class value as unique if they have white space between
	// words.
	// Example: class value of user id, this is unique, but a compound class -->
	// "cms-login-field ng-dirty ng-touched ng-invalid"

	@FindBy(xpath = "//span[text()='SIGN UP']")
	WebElement signUpButton;// can you explain this line please???????

	public void clickSignUpButton() throws InterruptedException {
		signUpButton.click();
		Thread.sleep(5000);
	}

}
