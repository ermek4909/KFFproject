package heap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Driver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kff.org/statedata/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		
		driver.findElement(By.xpath("//div[@id='hs-en-cookie-confirmation-buttons-area']//a")).click();

//		// //*[name()='svg']/*[name()='g']/*[name()='rect' and @fill='#919EF9'][2]
//		// //*[name()='svg']/*[name()='g' and @class='datamaps-subunits']
//
//		// WebElement ver = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'
//		// and @class='datamaps-subunits']"));
//		// ver.isDisplayed();
//		// Assert.assertTrue(ver.isDisplayed());
//
//		// Actions act = new Actions(driver);
//		// act.clickAndHold(driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'
//		// and @class='datamaps-subunit AL']"))).build().perform();
//		// act.click().build().perform();
//		//// driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'
//		// and @class='datamaps-subunit AL']")).click();

		
		
		
		////////////////////////////////////////////////////////////
		
		// Test cases two 
		
		
//		// step 2
//		WebElement verMap = driver
//				.findElement(By.xpath("//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']"));
//		System.out.println(verMap.isDisplayed()); // true
//
//		// step 3 - click on Ohio state
//		WebElement ohio = driver.findElement(
//				By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit OH']"));
//		ohio.click();
//
//		// step 4 - verify that correct page is opened
//		WebElement oText = driver.findElement(By.xpath("(//div[@id='state-path-wrapper'])//h2[1]"));
//		oText.getText();
//		oText.isDisplayed();
//		String text = "Ohio: Categories and Indicators";
//		Assert.assertEquals(oText.isDisplayed(), true, text);
//
//		// step 5 - go back
//		WebElement oText1 = driver.findElement(By.xpath("((((//div[@class='pane'])//nav[3])//ul)//li[2])/a"));
//		System.out.println(oText1.getText());
//		System.out.println(oText1.isDisplayed()); // true
//		String temp = "State Health Facts";
//		Assert.assertEquals(oText1.isDisplayed(), true, temp);
//		oText1.click();
//
//		// step 6 - click on Alabama state
//		WebElement Alabama = driver.findElement(
//				By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']"));
//		Alabama.click();
//
//		// step 7 - verify that correct page is opened
//		WebElement aText = driver.findElement(By.xpath("(//div[@id='state-path-wrapper'])//h2[1]"));
//		aText.getText();
//		aText.isDisplayed();
//		String textA = "Alabama: Categories and Indicators";
//		Assert.assertEquals(aText.isDisplayed(), true, textA);
//
//		// step 8 - go back
//		WebElement aText1 = driver.findElement(By.xpath("((((//div[@class='pane'])//nav[3])//ul)//li[2])/a"));
//		System.out.println(aText1.getText());
//		System.out.println(aText1.isDisplayed()); // true
//		String tempA1 = "State Health Facts";
//		Assert.assertEquals(aText1.isDisplayed(), true, tempA1);
//		aText1.click();
//
//		// step 9 - click on North Carolina state
//		WebElement NorthCarolina = driver.findElement(
//				By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit NC']"));
//		NorthCarolina.click();
//
//		// step 10 - verify that correct page is opened
//		WebElement nText = driver.findElement(By.xpath("(//div[@id='state-path-wrapper'])//h2[1]"));
//		nText.getText();
//		nText.isDisplayed();
//		String textN = "North Carolina: Categories and Indicators";
//		Assert.assertEquals(nText.isDisplayed(), true, textN);

		
		
		
		
		
		// step 11 - go back
//		WebElement nText1 = driver.findElement(By.xpath("((((//div[@class='pane'])//nav[3])//ul)//li[2])/a"));
//		System.out.println(nText1.getText());
//		System.out.println(nText1.isDisplayed()); // true
//		String tempn1 = "State Health Facts";
//		Assert.assertEquals(nText1.isDisplayed(), true, tempn1);
//		nText1.click();

		
		////////////////////////////////////////////////////////////
		
		// Test cases 20 
		
		
		// Step - 1, Launch browser and go to Health Insurance Marketplace Calculator 
		WebElement home = driver.findElement(By.xpath("(((//div[@class='pane'])//nav[3])//ul)//li[1]//a"));
		home.click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='topic'])[2]"))).click().build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='slab-container left-column center masonry'])//div[11]"))).click().build().perform();
		
		
		
		// Step - 2, Scroll down to "Enter Information About Your Household"
//		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		js.executeScript(Script,Arguments);
		Thread.sleep(2000);   // ((//div[@class='clearfix']//..)[1]//..)[1]   //(//div[@id='scroll-form'])//h4
		action.moveToElement(driver.findElement(By.xpath("((//div[@class='clearfix']//..)[1]//..)[1]"))).build().perform();
		
		
		
		// Step - 3, Click on "No adults" button 
		WebElement elem = driver.findElement(By.xpath("//select[@name='adult-count']"));
		elem.click();
		
		
		
		
		
		
		
		
		
		// Step - 4,  Verify that three options are visible 
		Actions selAct = new Actions(driver);
		
		//WebElement verifelem = driver.findElement(By.xpath("//select[@name='adult-count']//option"));
		
		Select select = new Select(elem);
//		select.selectByIndex(0); // true 
//		select.selectByIndex(1);
//		select.selectByIndex(2);
//		select.selectByIndex(3);
		
		
		
		
		
		
		
		List<WebElement> web=driver.findElements(By.xpath("//*[@name='adult-count']/option"));
		for(int i = 0; i < web.size();i++) {	
		System.out.println(web.get(i).isDisplayed()); // should be print out 7 time's true 
		}
		
		
		
		
		
		
		
		
		
		
//		// Step - 5, Click option "1 Adult"
//		select.selectByIndex(1);
//		
//		// Step - 6, Verify that "adult number" check boxes are clickable 
//		WebElement ver1 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[1]"));
////		ver1.isDisplayed();
//		System.out.println(ver1.isDisplayed());
//		Assert.assertTrue(ver1.isDisplayed());
//		
//		
//		
//		
//		
//		// Step - 7, Click option "2 Adult"
//		select.selectByIndex(2);
//		
//		// Step - 8, Verify that "adult number" check boxes are clickable
//		WebElement ver2 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[2]"));
//		System.out.println(ver2.isDisplayed());
//		Assert.assertTrue(ver2.isDisplayed());
//		
//		
//		
//		
//		// Step - 9, Click option "3 Adult"
//		select.selectByIndex(3);
//		
//		// Step - 10, Verify that "adult number" check boxes are clickable 
//		WebElement ver3 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[3]"));
//		System.out.println(ver3.isDisplayed());
//		Assert.assertTrue(ver3.isDisplayed());
//		
//		
//		
//		
//		// Step - 11, Click option "4 Adult"
//		select.selectByIndex(4);
//		
//		// Step - 12, Verify that "adult number" check boxes are clickbale
//		WebElement ver4 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[4]"));
//		System.out.println(ver4.isDisplayed());
//		Assert.assertTrue(ver4.isDisplayed());
//		
//		
//		
//		
//		// Step - 13, Click option "5 Adult"
//		select.selectByIndex(5);
//		
//		// Step - 14, Verify that "adult number" check boxes are clickbale
//		WebElement ver5 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[5]"));
//		System.out.println(ver5.isDisplayed());
//		Assert.assertTrue(ver5.isDisplayed());
//		
//		
//		
//		
//		// Step - 15, Click option "6 Adult"
//		select.selectByIndex(6);
//		
//		// Step - 16, Verify that "adult number" check boxes are clickbale
//		WebElement ver6 = driver.findElement(By.xpath("//div[@class='adult-info clearfix']//p[6]"));
//		System.out.println(ver6.isDisplayed());
//		Assert.assertTrue(ver6.isDisplayed());
		
		
		
		
	}

}
