package objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatamapSection extends BasePage {

	public DatamapSection(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@class='DatamapSettings__filter']")
	WebElement txtdatamapvariables;
	
	@FindBy(xpath="//section[@class='DatamapSettings__scroll']//*//input[@id='ctAHModelNoCharacter1_15']")
	WebElement txtIDUModelNum;
	
	@FindBy(xpath="//input[@id='commissionStatus']")
	WebElement txtcommstatusvariable;
	
	public void searchdatmapvariables(String variable)
	{
		txtdatamapvariables.sendKeys(variable);
	}
	
	public boolean iduModelNum()
	{
		try
		{
		    return txtIDUModelNum.isDisplayed();
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	public void commStatusChange(String parameter)
	{
		txtcommstatusvariable.clear();
		txtcommstatusvariable.sendKeys(parameter);
	}

}
