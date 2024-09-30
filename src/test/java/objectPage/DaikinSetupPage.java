package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DaikinSetupPage extends BasePage{

	public DaikinSetupPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='begin setup']")
	WebElement btnBeginSetup;
	
	
	
	
	public void beginSetupButton()
	{
		btnBeginSetup.click();
	}
}
