package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.HomePage;
import Utilis.TestContextSetup;
import io.cucumber.java.en.Then;

public class checkOutPage {
	public	WebDriver driver;
	TestContextSetup testContextSetup;
	
	public checkOutPage(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Then("user will place order")
	public void user_will_place_order() {

		
		//avoided creating Object
		HomePage homePage = testContextSetup.PageObjectManager.getHomePage();
		homePage.proceedToCheckOut();
	}
}
