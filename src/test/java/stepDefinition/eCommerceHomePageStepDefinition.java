package stepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.HomePage;
import Utilis.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eCommerceHomePageStepDefinition {
public	WebDriver driver;
TestContextSetup testContextSetup;

	public eCommerceHomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		

	}
	
	@When("^search for product (.+)$")
	public void search_for_product(String prodName) {

		HomePage homePage = testContextSetup.PageObjectManager.getHomePage();
		
		Assert.assertTrue(homePage.getTitle().contains("Amazon"));

		homePage.searchItem(prodName);
		homePage.addSearchItemtoCart();
		homePage.clickOnCart();
	}
	
	

}
