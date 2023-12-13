package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	
	
	
	// The test executed based on alphabetical order, if no priority given
	// (enabled = true) means The test case is not disable, it can run
	// (enabled = false) means The test case is disable, it is not running
	// priority = 1 means, this test case will run first, 2 means second .... ... so
	// on

	@Test
	public void clickSignUpButtonTest() throws InterruptedException {// throws exception ta keno aslo???
		homePage.clickSignUpButton();
	}

}
