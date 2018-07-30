package heap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Driver;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kff.org/statedata/");
		driver.manage().window().fullscreen();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hs-en-cookie-confirmation-buttons-area']//a")).click();
		
		// //*[name()='svg']/*[name()='g']/*[name()='rect' and @fill='#919EF9'][2]
		// //*[name()='svg']/*[name()='g' and @class='datamaps-subunits'] 

//		WebElement ver = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']"));
//		ver.isDisplayed();
//		Assert.assertTrue(ver.isDisplayed());
		
		
		
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']"))).build().perform();
		act.click().build().perform();
//	   driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']")).click();
		
		
	}

}
