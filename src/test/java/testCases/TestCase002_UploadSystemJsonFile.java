package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.DaikinSetupPage;
import objectPage.DatamapSection;
import objectPage.EquipmentSetupPage;
import objectPage.SimulatorPage;
import objectPage.SmartThermostatSetupPage;
import testBase.BaseClass;
import utilities.UploadfileUtility;

public class TestCase002_UploadSystemJsonFile extends BaseClass {
	

	@Test
	public void uploadfile()
	{
		try
		{
		logger.info("*******Started TestCase002*********");
		SimulatorPage sp=new SimulatorPage(driver);
		logger.info("*******click operation on upload button********");
		//String path ="C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\ThermostatTestingV3.4.5\\testData\\fit-gen.json";
		String path =".//testData////fit-gen.json";
		sp.uploadbutton();
		
		UploadfileUtility file=new UploadfileUtility(path);
		file.getClass();
		
				
		DatamapSection dsp=new DatamapSection(driver);
		dsp.commStatusChange("2");
		logger.info("******changed to commissing*******");
		
		WebElement idframe=driver.findElement(By.xpath("//div[@class='Preview__content']//iframe"));
		driver.switchTo().frame(idframe);
		

		logger.info("******Switched to frame *****");
		
		DaikinSetupPage dsup=new DaikinSetupPage(driver);
		dsup.beginSetupButton();
		
		SmartThermostatSetupPage stsp=new SmartThermostatSetupPage(driver);
		stsp.equipmentSetupButton();
		
		EquipmentSetupPage esp=new EquipmentSetupPage(driver);
		boolean value=esp.odunit();
		
		driver.switchTo().defaultContent();

		logger.info("*****TestCase001 Passed...*");
			Assert.assertEquals(value,true);
		}
		catch(Exception e)
		{
			logger.error("Test failed :"+e.getMessage());
			logger.debug("Debug logs .....");
			Assert.fail("Test Failed :"+ e.getMessage());
		}
		finally
		{
			logger.info("*******Stoppped TestCase001*********");
		}

	
	}
	
}
