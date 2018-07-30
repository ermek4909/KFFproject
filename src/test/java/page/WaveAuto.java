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
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']")
	public WebElement mapVis;
	
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit TX']")
	public WebElement Texas;
	@FindBy(xpath = "(//div[@class='datamaps-hover']//span)[3]")
	public WebElement textTX;
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path' and @class='datamaps-subunit MN']")
	public WebElement Minnesota;
	@FindBy(xpath = "")
	public WebElement textMN;
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path' and @class='datamaps-subunit CO']")
	public WebElement Colorado;
	@FindBy(xpath = "")
	public WebElement textCO;
	
	

}
