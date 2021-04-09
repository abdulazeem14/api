package Module2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class CheckTitle extends Base {
	@Test
	public void CheckTitle() throws IOException
	{
	wd=initializeDriver();
	wd.get(prop.getProperty("url"));
//	Assert.assertEquals(wd.getTitle(),"QTRecognition");
	Assert.assertNotEquals(wd.getTitle(), "QTRecognition");
	
	
	
	System.out.println("tested");
	wd.close();
	
	}

}
