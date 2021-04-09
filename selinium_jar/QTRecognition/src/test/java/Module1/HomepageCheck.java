package Module1;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.Base;


import java.io.IOException;



public class HomepageCheck extends Base{

	@Test
	public void checkhomepage() throws IOException, InterruptedException {
		wd=initializeDriver();
		log1.info("Launching Google chrome Driver version 89 for this test");
		wd.get(prop.getProperty("url"));
		log1.info("Application is accessible in https://qtrecognition.testqtwiz.com/");
		takeScreenshot();
				
	}
	@AfterTest
	public void aftertestfunction()
	{
		wd.close();
	}
	

}
