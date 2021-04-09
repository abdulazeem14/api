package Module4;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Module3.Precondition;
import pageObjects.ActivityPage;
import resources.Base;

public class FindKudosSearch extends Base{
	Precondition pc=new Precondition();
	@Test(dataProvider="validdata")
	public void findkudosSearch(String username,String password) throws IOException {
		
		pc.preCond(username,password);
		ActivityPage ap=new ActivityPage(pc.wd);
	if(ap.findKudos().isDisplayed())
	{
		log1.info("Kudo Search option is present in the Activity Page");
	}
	else
	{
		log1.fatal("Kudo Search option is Not present in the Activity Page");	
		}
		
	}
	@AfterTest
	public void closeBrowser()
	{
	pc.wd.close();
	}
	@DataProvider
	public Object[][] validdata(){
		Object[][] data=new Object[1][2];
		data[0][0]="azeem.hameed@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		return data;
	}

}
