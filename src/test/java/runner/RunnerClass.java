package runner;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Functions;

import page.WaveAuto;
import utilities.Config;
import utilities.Driver;

public class RunnerClass {
	
	
	WaveAuto pom = new WaveAuto();
	
	@Test (priority = 0)
	
	public void TestCase1() throws InterruptedException {
	
		// launch browser and go to State Health Facts page  
		Driver.getDriver().get(Config.getValue("url1"));
	
		 
		Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		pom.AcceptBtn.click();
		
		
		// Verify that United States map is visible 
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act = new Actions(Driver.getDriver());
		
		
		
		
	
	
	}
	

	
	
	

}
