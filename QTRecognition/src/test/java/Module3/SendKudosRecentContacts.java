package Module3;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SendKudosRecentContacts extends Base{
	@Test(dataProvider="validdata")
	public void sendkudosrecentcontacts(String username,String password) throws IOException, InterruptedException
	{
		Precondition pc=new Precondition();
		pc.preCond(username, password);
		ActivityPage ap=new ActivityPage(pc.wd);
		Thread.sleep(5000L);
		ap.recentKudos().click();
		Thread.sleep(2000L);
		ap.kudosType("Quality Hero");
		ap.comments().sendKeys("HER-O");
		ap.send().click();
		
		
		
	}
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}

}
