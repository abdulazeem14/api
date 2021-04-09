package Module3;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class ConfirmationMessage extends Base{
	@Test(dataProvider="validdata")
	public void confirmationmessage(String username,String password) throws IOException, InterruptedException, AWTException
	{
		wd=initializeDriver();
		SendKudos sk=new SendKudos();
		sk.sendKudos("prasana",wd);
		ActivityPage ap=new ActivityPage(sk.wd);
		String comments=ap.comments1().getText();
	if(comments.equals(prop.getProperty("comments")))
	{
		log1.info("Passed:Kudos is Sent and Verified");
	}
	else
	{
		log1.info("Failed:Kudos is not sent and Verified");
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
