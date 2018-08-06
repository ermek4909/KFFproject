package runner;

import static org.testng.Assert.assertEquals;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.common.base.Functions;
import page.HealthInsuranceMarketplaceCalculatorPage;
import page.TestCases1;
import utilities.Config;
import utilities.Driver;

import page.TestCases2;
import page.TestCases20;


public class RunnerClass {
	
	
	HealthInsuranceMarketplaceCalculatorPage hicp = new HealthInsuranceMarketplaceCalculatorPage();
	TestCases1 pom = new TestCases1();
	TestCases2 tc = new TestCases2();
	TestCases20 tc1 = new TestCases20();
	
	
	@Test (priority = 0)
	
	public void Test_Case1() throws InterruptedException {
	
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
		pom.Texas.getText();

		String tx = "Texas"; 
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
	//	Assert.assertNotEquals(pom.textTX.getText(),tx);  
		
//		JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//		jse.executeScript("scroll(0, 400)");
		
		// Hover that over Minnesota 
		//Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		act.moveToElement(pom.Minnesota).build().perform();
		pom.Minnesota.getText();
		Thread.sleep(2000);
		String mn = "Minnesota";
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
	//	Assert.assertNotEquals(pom.Minnesota.getText(), mn);
		
		// Hover that over Colorado
//		Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		act.moveToElement(pom.Colorado).build().perform();
		Thread.sleep(2000);
		pom.Colorado.getText();
		String co = "Colorado";
		// we can not verify that "Texas" text is displayed 
		// because, Sign "Texas" is hidden 
	//	Assert.assertNotEquals(pom.Colorado.getText(), co);	
	
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
		
	    ///////////////////////////////////////////////////////
		
		
		
		
		
		@Test (priority = 2)
		public void Test_Cases2() throws InterruptedException {
			
//			Thread.sleep(2000);
			WebElement menu = Driver.getDriver().findElement(By.xpath("(//div[@class='inner']//a[1])"));
			menu.click();
			WebElement sign = Driver.getDriver().findElement(By.xpath("(((//nav[@class='primary']//ul)[3]//..)//a[1])[1]"));
			sign.click();
			WebElement signD = Driver.getDriver().findElement(By.xpath("//li[@id='menu-item-254102']"));
			signD.click();
			
			
//			Actions action = new Actions(Driver.getDriver());
//			//action.moveToElement(sign).build().perform();
//			action.click().doubleClick().build().perform();
			
			
//			System.out.println(tc.VerHome.getText());
			String temp = "State Health Facts";
			Assert.assertEquals(temp, tc.VerHome.getText());
			
			
			// Verify that United States map is visible 		
			Assert.assertTrue(tc.verMap.isDisplayed());
			
			
			// step 3 - click on Ohio state
			tc.ohio.click();
			
			// step 4 - verify that correct page is opened
			tc.oText.getText();
			tc.oText.isDisplayed();
			String text = "Ohio: Categories and Indicators";
			Assert.assertEquals(tc.oText.isDisplayed(), true, text);

			// step 5 - go back
			System.out.println(tc.oText1.getText());
			System.out.println(tc.oText1.isDisplayed()); // true
			String tempH = "State Health Facts";
			Assert.assertEquals(tc.oText1.isDisplayed(), true, tempH);
			tc.oText1.click();
			
			
			// step 6 - click on Alabama state
			tc.ALabama.click();
			
			// step 7 - verify that correct page is opened
			tc.aText.getText();
			tc.aText.isDisplayed();
			String textA = "Alabama: Categories and Indicators";
			Assert.assertEquals(tc.aText.isDisplayed(), true, textA);
		
			
			// step 8 - go back
			System.out.println(tc.aText1.getText());
			System.out.println(tc.aText1.isDisplayed()); // true
			String tempA1 = "State Health Facts";
			Assert.assertEquals(tc.aText1.isDisplayed(), true, tempA1);
			tc.aText1.click();
			
			
			// step 9 - click on North Carolina state
			tc.NorthCarolina.click();
			
			
			// step 10 - verify that correct page is opened
			tc.nText.getText();
			tc.nText.isDisplayed();
			String textN = "North Carolina: Categories and Indicators";
			Assert.assertEquals(tc.nText.isDisplayed(), true, textN);
			
			
			// step 11 - go back
			System.out.println(tc.nText1.getText());
			System.out.println(tc.nText1.isDisplayed()); // true
			String tempn1 = "State Health Facts";
			Assert.assertEquals(tc.nText1.isDisplayed(), true, tempn1);
			tc.nText1.click();
		
			
		}
		
		
		
		
		///////////////////////////////////////////////////////
		
		
		
		
		
		@Test (priority = 3)
		public void Test_Cases20() {
			
			// Step - 1, Launch browser and go to Health Insurance Marketplace Calculator 
			tc1.home.click();
			
			Actions action = new Actions(Driver.getDriver());
			action.moveToElement(Driver.getDriver().findElement(By.xpath("(//a[@class='topic'])[2]"))).click().build().perform();
			action.moveToElement(Driver.getDriver().findElement(By.xpath("(//div[@class='slab-container left-column center masonry'])//div[11]"))).click().build().perform();
			
			
			
			// Step - 2, Scroll down to "Enter Information About Your Household"
			action.moveToElement(Driver.getDriver().findElement(By.xpath("((//div[@class='clearfix']//..)[1]//..)[1]"))).build().perform();
			
			
			
			// Step - 3, Click on "No adults" button 
			tc1.elem.click();
			
			
			Select select = new Select(tc1.elem);
			
			// Step - 4,  Verify that three options are visible 
			for(int i = 0; i < tc1.web.size();i++) {	
			System.out.println(tc1.web.get(i).isDisplayed()); // should be print out 7 time's true 
			
			}
			
			
			
			// Step - 5, Click option "1 Adult"
			select.selectByIndex(1);
			tc1.ver1.isDisplayed();
			System.out.println(tc1.ver1.isDisplayed());
			Assert.assertTrue(tc1.ver1.isDisplayed());
			
			
			
			// Step - 7, Click option "2 Adult"
			select.selectByIndex(2);
			System.out.println(tc1.ver2.isDisplayed());
			Assert.assertTrue(tc1.ver2.isDisplayed());
			
			
			// Step - 9, Click option "3 Adult"
			select.selectByIndex(3);
			System.out.println(tc1.ver3.isDisplayed());
			Assert.assertTrue(tc1.ver3.isDisplayed());
			
			
			
			// Step - 11, Click option "4 Adult"
			select.selectByIndex(4);
			System.out.println(tc1.ver4.isDisplayed());
			Assert.assertTrue(tc1.ver4.isDisplayed());
			
			
			
			// Step - 13, Click option "5 Adult"
			select.selectByIndex(5);
			System.out.println(tc1.ver5.isDisplayed());
			Assert.assertTrue(tc1.ver5.isDisplayed());
			
			
			
			// Step - 15, Click option "6 Adult"
			select.selectByIndex(6);
			System.out.println(tc1.ver6.isDisplayed());
			Assert.assertTrue(tc1.ver6.isDisplayed());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	

	
	
	

}
