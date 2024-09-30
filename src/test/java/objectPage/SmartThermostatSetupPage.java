package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartThermostatSetupPage extends BasePage
{

	public SmartThermostatSetupPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/setup-full/equipment-setup']//div[@class='LineItem__root']//div[@class='LineItem__content']//span[@class='Text__root Heading__root CommissioningStepLink__root Heading__root CommissioningStepLink__root']")
	//@FindBy(xpath="(//span[@class='Text__root Label__root Label__root'])[1]")
	WebElement btnequipmentsetup;
	
	
	
	public void equipmentSetupButton()
	{	
		btnequipmentsetup.click();
	}
}
