package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.HomePage;
import PageObject.signInPage;
import Utilis.TestContextSetup;
import io.cucumber.java.en.When;

public class signInPageStrepDefinition {
	public	WebDriver driver;
	TestContextSetup testContextSetup;

	public signInPageStrepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@When("User will signin to application with usermame {string} and password {string}")
	public void user_will_signin_to_application_with_and(String Username, String Password) throws Throwable {
	
		
		//avoided creating Object
		signInPage SignIn = testContextSetup.PageObjectManager.getMeSignInPage();
		HomePage homePage = testContextSetup.PageObjectManager.getHomePage();
		homePage.clickOnSignIn();
		Thread.sleep(4000);
		SignIn.enterUN(Username);
		SignIn.submitUN();
		SignIn.enterPW(Password);
		SignIn.clickOnSubmit();
		
	}

}
