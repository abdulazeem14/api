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
		wd.get(prop.getProperty("url"));
		log1.info("Launching Google chrome Driver version 89 for this test");
				
	}
	@AfterTest
	public void aftertestfunction()
	{
		wd.close();
	}
	

}
