package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import utilities.BrowserUtils;
import utilities.Config;
import utilities.Driver;

public abstract class TestBase {
	protected WebDriver driver;
	protected Actions eactions;

	protected ExtentReports report; // just report 
	protected ExtentHtmlReporter htmlReporter; // html reporter takes's reporter to build html code 
	protected ExtentTest extentLogger; // using for keep writing  for reporting stuff 

	@BeforeTest
	public void setUpTest() {
		// actual reporter
		report = new ExtentReports(); // object for beforetest 
		// System.getProperty("user.dir") ---> get the path to current project
		// test-output --> folder in the current project, will be created by testng if
		// it does not already exist
		// report.html --> name of the report file
		String filePath = System.getProperty("user.dir") + "/test-output/report.html";
		htmlReporter = new ExtentHtmlReporter(filePath); 

		report.attachReporter(htmlReporter); //  we are connecting with report object on line 32 

		report.setSystemInfo("ENV", "staging");
		report.setSystemInfo("browser", Config.getValue("browser"));
		report.setSystemInfo("OS", System.getProperty("os.name"));

		htmlReporter.config().setReportName("Web Orders Automated Test Reports"); //is the name of the title 
	}

	@BeforeMethod(alwaysRun = true) // if we will init our report on before method so then we have to create  new method every time 
	public void setUp() {
		driver = Driver.getDriver();
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().fullscreen();
//
//		driver.get(Config.getValue("url"));

	}

	@AfterMethod(alwaysRun = true) // after every test ITest goes and see method password fails  
	public void tearDown(ITestResult result) throws IOException {   // i test result means 
		
		// checking if the test method failed
		if (result.getStatus() == ITestResult.FAILURE) {
			
			// get screenshot using the utility method and save the location of the screenshot
			String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
			
			// capture the name of test method
			extentLogger.fail(result.getName());
			
			// add the screenshot to the report
			extentLogger.addScreenCaptureFromPath(screenshotLocation);
			
			// capture the exception thrown
			extentLogger.fail(result.getThrowable());

		} else if (result.getStatus() == ITestResult.SKIP) {
			extentLogger.skip("Test Case Skipped is " + result.getName());
		}
//		Driver.closeDriver();
	}

	@AfterTest
	public void tearDownTest() {
		report.flush(); // cleaning the reporter once and if we have a new test it's going getting new one 
	}
	
	

}
