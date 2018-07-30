package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WaveAuto {
	
	
	public WaveAuto() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy(xpath = "//div[@id='hs-en-cookie-confirmation-buttons-area']//a")
	public WebElement AcceptBtn;
	
	@FindBy(xpath = "//div[@class='inner']//h2")
	public WebElement doubleCheck;
	
//	@FindBy(xpath = "(//div[@id='map-container'])")
//	public List<WebElement> mapVis;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement Texas;
	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	public WebElement signin;
	
	
	
	
	
	
	
	

}
