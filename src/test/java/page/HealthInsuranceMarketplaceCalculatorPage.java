package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HealthInsuranceMarketplaceCalculatorPage {
	
	public HealthInsuranceMarketplaceCalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='income']")
	public WebElement incomeBox;
	
	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath = "//div[@class='box full-post beige subsidy-results-wrapper']//h2")
	public WebElement resultText;
}
