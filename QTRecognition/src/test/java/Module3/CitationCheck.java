package Module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class CitationCheck extends Base{
	@Test(dataProvider="validdata")
	public void citationcheck(String username,String password) throws IOException, InterruptedException, AWTException
	{
		Precondition pc=new Precondition();
		pc.preCond(username, password);
		ActivityPage ap=new ActivityPage(pc.wd);
		ap.sendKudos().click();
		Thread.sleep(5000L);
		ap.emailaddr().sendKeys("prasana");
//		STRING ARD=KEYS.CHORD(KEYS.DOWN);
//		STRING ENTER=KEYS.CHORD(KEYS.ENTER);
		//ap.emailaddr().sendKeys(ard);
		//Thread.sleep(2000);	
		//ap.emailaddr().sendKeys(enter);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);
        ap.kudos().click();
      ap.send().click();
      log1.info("User should write citation for Kudos. Sending Kudos without citation are not allowed");
      Thread.sleep(2000L);
        ap.comments().sendKeys("great work");
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
