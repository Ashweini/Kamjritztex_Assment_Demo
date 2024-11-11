package Utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver webDriverMangaer() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/global.properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		
		if(driver==null)
		{
			if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		}
		return driver;
		
		
	}

}
