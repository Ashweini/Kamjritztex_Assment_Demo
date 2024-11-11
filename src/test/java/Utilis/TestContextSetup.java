package Utilis;

import org.openqa.selenium.WebDriver;
import PageObject.pageObjectManager;


public class TestContextSetup {
	public	WebDriver driver;
	public pageObjectManager PageObjectManager;
	public TestBase testbase;
	
	public TestContextSetup() throws Throwable {
		testbase = new TestBase();
		PageObjectManager= new pageObjectManager(testbase.webDriverMangaer());
		
	}
	
}
