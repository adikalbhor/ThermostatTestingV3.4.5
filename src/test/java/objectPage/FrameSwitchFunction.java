package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrameSwitchFunction extends BasePage{

	public FrameSwitchFunction(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='Preview__content']//iframe")
	WebElement pathiframe;
	
	public void frameswitch(String framevalue)
	{
		driver.switchTo().frame(framevalue);
	}
	
	public void switchbackfromframe()
	{
		driver.switchTo().defaultContent();
	}
}
