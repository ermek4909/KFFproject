package runner;

import static org.testng.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Functions;

import page.HealthInsuranceMarketplaceCalculatorPage;
import page.WaveAuto;
import utilities.Config;
import utilities.Driver;

public class RunnerClass {
	
	
	WaveAuto pom = new WaveAuto();
	HealthInsuranceMarketplaceCalculatorPage hicp = new HealthInsuranceMarketplaceCalculatorPage();
	
	@Test (priority = 0)
	
	public void TestCase1() throws InterruptedException {
	
		// launch browser and go to State Health Facts page  
		Driver.getDriver().get(Config.getValue("url1"));
	
		 
		Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		pom.AcceptBtn.click();
		
		
		// Verify that United States map is visible 		
		Assert.assertTrue(pom.mapVis.isDisplayed());
		
		
		// Hover that over Texas 
		Actions act = new Actions(Driver.getDriver());
		act.moveToElement(pom.Texas).build().perform();
		Thread.sleep(2000);
		

		String tx = "Texas"; 
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
		Assert.assertEquals(pom.textTX.getText(),tx);  
		
		
//		JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//		jse.executeScript("scroll(0, 400)");
		
		// Hover that over Minnesota 
		//Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		act.moveToElement(pom.Minnesota).build().perform();
		Thread.sleep(2000);
		pom.Minnesota.getText();
		String mn = "Minnesota";
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
		Assert.assertNotEquals(pom.Minnesota.getText(), mn);
		
		
		
		// Hover that over Colorado
//		Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		act.moveToElement(pom.Colorado).build().perform();
		Thread.sleep(2000);
		pom.Colorado.getText();
		String co = "Colorado";
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
		Assert.assertNotEquals(pom.Colorado.getText(), co);	
	}
		
	
	
	
	
	///////////////////////////////////////////////////////
		
		@Test (priority = 1)
		public void SmokeTest3() throws InterruptedException {
			Driver.getDriver().get(Config.getValue("urlCalculatorPage"));
			
			Thread.sleep(3000);
			Random rd = new Random();
			int rnd = rd.nextInt(90000) + 10000;
			String rndN = Integer.toString(rnd);
			hicp.incomeBox.sendKeys(rndN);
			Thread.sleep(3000);
			hicp.submitBtn.click();
			
			String expectedResult = "RESULTS";
			String actualResult = hicp.resultText.getText();
			Assert.assertEquals(expectedResult, actualResult);
			
		}
		
		
		
		
		
		
		
		
	
	
	

	
	
	

}
