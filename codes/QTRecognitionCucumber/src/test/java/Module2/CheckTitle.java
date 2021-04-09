package Module2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class CheckTitle extends Base {
	@Test
	public void CheckTitle() throws IOException
	{
	wd=initializeDriver();
	wd.get(prop.getProperty("url"));
	
	Assert.assertEquals(wd.getTitle(),"QTRecognition");

	log1.info("Pass:Application title is displayed as QTRecognition");
	wd.close();
	
	
	}
	
	@AfterMethod
	public void aftmethod(ITestResult result){
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	    	log1.error("Failed:Application title is Not displayed as QTRecognition");
	       wd.close();
	    }
	 }

}
