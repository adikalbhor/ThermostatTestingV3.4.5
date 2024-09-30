package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EquipmentSetupPage extends BasePage{

	public EquipmentSetupPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/setup-full/equipment-setup/outdoor']//div[@class='LineItem__root']")
	WebElement txtodunit;
	
	public boolean odunit()
	{
		return txtodunit.isDisplayed();
	}
}
