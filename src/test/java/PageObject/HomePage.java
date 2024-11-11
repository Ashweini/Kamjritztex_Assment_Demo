package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By signIn = By.xpath("//a[@data-nav-ref='nav_ya_signin']");
	By search = By.cssSelector("input#twotabsearchtextbox");
	By addToCart = By.cssSelector("button#a-autoid-1-announce");
	By clickCart = By.cssSelector("a#nav-cart");
	By checkOut = By.xpath("//input[@name='proceedToRetailCheckout']") ;
	
	public void clickOnSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void searchItem(String prodName) {
		driver.findElement(search).sendKeys(prodName,Keys.ENTER);
	}
	
	public void addSearchItemtoCart() {
		driver.findElement(addToCart).click();
	}

	public void clickOnCart() {
		driver.findElement(clickCart).click();
	}
	
	public void proceedToCheckOut() {
		driver.findElement(checkOut).click();
	}
	
	public String getTitle() {
		String getTitleHomePage = driver.getTitle();
		return getTitleHomePage;
	}
}
