package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TestCases2 {
	
	
	public TestCases2() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "(//div[@class='inner'])//a[@class='topic']")
	public WebElement VerHome;
	
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']")
	public WebElement verMap;
	
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit OH']")
	public WebElement ohio;
	
	
	@FindBy(xpath = "(//div[@id='state-path-wrapper'])//h2[1]")
	public WebElement oText;
	
	
	@FindBy(xpath = "((((//div[@class='pane'])//nav[3])//ul)//li[2])/a")
	public WebElement oText1;
	
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']")
	public WebElement ALabama;
	
	
	@FindBy(xpath = "(//div[@id='state-path-wrapper'])//h2[1]")
	public WebElement aText;
	
	
	@FindBy(xpath = "((((//div[@class='pane'])//nav[3])//ul)//li[2])/a")
	public WebElement aText1;
	
	
	@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit NC']")
	public WebElement NorthCarolina;
	
	
	@FindBy(xpath = "(//div[@id='state-path-wrapper'])//h2[1]")
	public WebElement nText;
	
	
	@FindBy(xpath = "((((//div[@class='pane'])//nav[3])//ul)//li[2])/a")
	public WebElement nText1;
	
	
	

}
