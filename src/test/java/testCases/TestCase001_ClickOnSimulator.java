package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPage.SimulatorPage;
import testBase.BaseClass;

public class TestCase001_ClickOnSimulator extends BaseClass {
	
	@Test
	public void clickOnSimAndSky()
	{
		try
		{
		logger.info("*******Started TestCase001*********");
		SimulatorPage sp=new SimulatorPage(driver);
		logger.info("*******click operation on simulator button********");
		sp.simulatorlink();
		
		boolean textsim=sp.simulatortext(); 
		Assert.assertEquals(textsim,true);
		
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
