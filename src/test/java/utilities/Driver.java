package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	public static WebDriver driver;

	public static WebDriver getDriver() {
		
		if(driver != null) {
			return driver;
		}
		
		String browser = Config.getValue("browser");
		
		switch(browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.manage().window().fullscreen();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.manage().window().fullscreen();
			break;
			
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
				
		}
		
		return driver;
	}
	
	/////////////////////////////////////////////////////////
	
//	public static WebDriver getDriver() {
//		if (driver == null) {
//			switch (Config.getProperty("browser")) {
//			case "firefox":
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//				break;
//			case "chrome":
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//				break;
//			case "ie":
//				WebDriverManager.iedriver().setup();
//				driver = new InternetExplorerDriver();
//				break;
//			}
//		}
//		return driver;
//	}
//
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	



}
