package Module3;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;

public class ConfirmationMessage {
	@Test(dataProvider="validdata")
	public void confirmationmessage(String username,String password) throws IOException, InterruptedException, AWTException
	{
		SendKudos sk=new SendKudos();
		sk.sendKudos(username, password);
		ActivityPage ap=new ActivityPage(sk.wd);
		ap.activitypage().getText();
		
		
	
	}
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}
	

}
