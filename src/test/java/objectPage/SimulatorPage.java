package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimulatorPage extends BasePage {

	public SimulatorPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='App__active']")
	WebElement lnksimulator;
	
	@FindBy(xpath="//a[normalize-space()='Skyport']")
	WebElement lnkskyport;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement btnupload;
	
	
	/*********************************************************************************************************/	
	
	
	public void simulatorlink()
	{
		lnksimulator.click();
	}
	public void skyportlink()
	{
		lnkskyport.click();;
	}
	
	public boolean simulatortext()
	{
		boolean textdisp=lnksimulator.isDisplayed();
		return textdisp;
	}
	
	public void uploadbutton()
	{
		btnupload.click();
	}
	
}
