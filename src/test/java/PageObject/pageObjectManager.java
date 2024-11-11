package PageObject;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	public HomePage homePage;
	public WebDriver driver;
	public signInPage SignIn;
	
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	
	public signInPage getMeSignInPage() {	
		SignIn = new signInPage(driver);
		return SignIn;
	}
	

}
