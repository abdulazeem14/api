package Module2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class Checkusername extends Base{
	@Test(dataProvider="validdata")
	public void checkUsername(String username,String password) throws IOException, InterruptedException {
		wd=initializeDriver();
		wd.get(prop.getProperty("url"));
		
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
		Thread.sleep(10000);
		Assert.assertEquals(ap.usernameId().getText(), prop.getProperty("usernameId"));
		String location=ap.usernameId().getCssValue("text-align");
		if(location.equals("left"))
		{
			log1.info(" userName is displayed in the left hand side of the screen");
		}
		else {
			log1.error("UserName is Not Dispalyed in the left hand side of the screen");
		}
	}
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
	}

}
