package Module1;

import java.io.IOException;

import org.testng.Assert;
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
		log1.info("Application title is displayed as QTRecognition");


	
	//Assert.assertNotEquals(wd.getTitle(), "QTRecognition");
	
	}
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}

}
