package Module4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Module3.Precondition;
import pageObjects.ActivityPage;
import resources.Base;

public class SearchKudos extends Base{
	Precondition pc=new Precondition();
	@Test(dataProvider="validdata")
	public void searchKudos(String username,String password) throws IOException, AWTException, InterruptedException
	{
		
		pc.preCond(username, password);
		ActivityPage ap=new ActivityPage(pc.wd);
		Thread.sleep(1000L);
		ap.findKudos().click();
		Thread.sleep(1000L);
		Object obj=ap.searchkudos().getAttribute("value");
		if(obj==null)
		{
			log1.info("Name or Email Address field is mandatory");
		}
	
		Thread.sleep(1000L);
		ap.searchkudos().sendKeys(prop.getProperty("searchkudos"));
		Thread.sleep(1000L);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);	
		Thread.sleep(10000L);
		ap.ksearchbutton().click();
		log1.info("successful search user able to see the list of kudos sent form or to the user.");
		
		
	}

	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}
	
}
