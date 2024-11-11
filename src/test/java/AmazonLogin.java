

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonLogin {

	@Test
	public void AmazonLogin() throws Throwable {
	//public static void main(String[] args) throws Throwable {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("ashwinir35108@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("August@start24");
		driver.findElement(By.id("signInSubmit")).click();
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]")).click();
//		driver.findElement(By.xpath("//div[@data-card-identifier=\"AddressesAnd1Click\"]")).click();
//		
//		//add your address
//		Thread.sleep(4000);
//		driver.findElement(By.id("ya-myab-plus-address-icon")).click();
//		
//		
//		//fill address 
//		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Ashwini R");
//		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("8748040756");
//		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressPostalCode")).sendKeys("560007");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressLine1")).sendKeys("K.R.Colony, 1st stage");
//		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressLine2")).sendKeys("Domluru");
//		driver.findElement(By.cssSelector("#address-ui-widgets-landmark")).sendKeys("near sidharth Nilaya");
//		Thread.sleep(2000);
////		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressCity")).sendKeys("Bangalore");
//		
//		
//		//dropdown
////		WebElement State = driver.findElement(By.xpath("//select[@name=\"address-ui-widgets-enterAddressStateOrRegion\"]"));
////		State.click();
////		Select select = new Select(State);
////		select.selectByVisibleText("KARNATAKA");
//		
//		driver.findElement(By.xpath("(//input[@type=\"submit\"])[4]")).click();
		
	}

}
