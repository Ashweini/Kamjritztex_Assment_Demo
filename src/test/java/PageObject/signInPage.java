package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage {
	
public WebDriver driver;
	
	public signInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By usernameTextBox = By.cssSelector("#ap_email");
	By submitUsername = By.className("a-button-input");
	By passwordTextBox = By.cssSelector("#ap_password");
	By signInButton = By.id("signInSubmit");
	

	
	public void enterUN(String username) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void submitUN() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(submitUsername).click();
	}
	
	public void enterPW(String password) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickOnSubmit() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(signInButton).click();
	}

}
