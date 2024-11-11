package stepDefinition;

import Utilis.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
	public TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void AfterScenario() throws Throwable {
		
		testContextSetup.testbase.webDriverMangaer().quit();
	}

}
