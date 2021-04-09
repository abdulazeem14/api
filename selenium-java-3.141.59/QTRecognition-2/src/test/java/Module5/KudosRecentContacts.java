package Module5;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class KudosRecentContacts extends Base{
	WebDriver wd;
	@BeforeTest
	public void precondition() throws IOException {
	 wd=initializeDriver();
		preCondition(wd);
	}
	
	@Test(dataProvider="data")
	public void sendkudosrecentcontacts(int d,WebDriver wd) throws IOException, InterruptedException
	{
		
		ActivityPage ap=new ActivityPage(wd);
		Thread.sleep(5000L);
		ap.recentContacts(d).click();
		//ap.recentKudos().click();
		Thread.sleep(10000L);
		ap.kudosType("Quality Hero");
		ap.comments().sendKeys("HER-O");
		ap.send().click();
		Thread.sleep(10000);
		
		
		
	}
	@DataProvider
	public Object[]  data(){
		Object[][] data= new Object[7][2];
		data[0][0]=1;
		data[0][1]=wd;
		data[1][0]=2;
		data[1][1]=wd;
		data[2][0]=3;
		data[2][1]=wd;
		data[3][0]=4;
		data[3][1]=wd;
		data[4][0]=5;
		data[4][1]=wd;
		data[5][0]=6;
		data[5][1]=wd;
		data[6][0]=7;
		data[6][1]=wd;
		
		
		
		return data;
	}

}
