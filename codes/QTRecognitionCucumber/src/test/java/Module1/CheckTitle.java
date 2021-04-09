package Module1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import jdk.internal.net.http.common.Log;
import resources.Base;

public class CheckTitle extends Base {
	@Test
	public void CheckTitle() throws IOException
	{
	wd=initializeDriver();
	wd.get(prop.getProperty("url"));

		Assert.assertEquals(wd.getTitle(),"QTRecognition","Application title is not QTRecognition");
		log1.info("Pass: Application title is displayed as QTRecognition");


	
	
	//Assert.assertNotEquals(wd.getTitle(), "QTRecognition");
	
	}
	@AfterMethod
	public void aftmethod(ITestResult result) throws IOException, InterruptedException{
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	    	log1.error("Failed: Application title is not displayed as mentioned in requirement");
	    	takeScreenshot();
	    	Thread.sleep(10000);
	       wd.close();
	    }
	 }
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}

	

}
