package page;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TestCases20 {
	
	public TestCases20() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "(((//div[@class='pane'])//nav[3])//ul)//li[1]//a")
	public WebElement home;
	
	@FindBy(xpath = "//select[@name='adult-count']")
	public WebElement elem;
	
	@FindBy(xpath = "//*[@name='adult-count']/option")
	public List<WebElement> web;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[1]")
	public WebElement ver1;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[2]")
	public WebElement ver2;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[3]")
	public WebElement ver3;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[4]")
	public WebElement ver4;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[5]")
	public WebElement ver5;
	
	@FindBy(xpath = "//div[@class='adult-info clearfix']//p[6]")
	public WebElement ver6;
	
	
	
	

}
