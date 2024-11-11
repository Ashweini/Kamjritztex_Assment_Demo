

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kamjritztex_Assessment {
	
	@Test
	public void eCommerceAppln() throws Throwable {
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
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("bluetooth",Keys.ENTER);
		driver.findElement(By.cssSelector("button#a-autoid-1-announce")).click();
		//driver.findElement(By.className("a-button a-button-span11 a-button-base a-button-small")).click();
		driver.findElement(By.cssSelector("a#nav-cart")).click();
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		
	}

}
