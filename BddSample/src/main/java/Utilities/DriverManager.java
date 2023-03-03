package Utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver launchBrowser() throws Exception {
		
		WebDriver driver=null;
		
		Properties properties=PropertiesLoader.loadProperties("src/test/resources/Config/config.properties");
		String browsername=properties.getProperty("browser");
		System.out.println(browsername);
		String url =properties.getProperty("url");
		
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://ritual.com");
			break;
		case "safari":
			WebDriverManager.chromedriver().setup();
			driver = new SafariDriver();
			driver.get("https://ritual.com");

		default:
			break;
		}
		
		return driver;
		
	}
	
	
}
