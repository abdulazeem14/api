 package Module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SelectEmailaddress extends Base{
	
	@Test(dataProvider="validdata")
	public void pre(String username,String password) throws IOException, InterruptedException, AWTException
	{
		
		wd=initializeDriver();
		wd.get(prop.getProperty("url"));
		
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
	Thread.sleep(1000);
	ap.sendKudos().click();
	
	Robot robot=new Robot();
	Thread.sleep(1000);
	ap.emailaddr().click();
	ap.emailaddr().sendKeys(prop.getProperty("username"));
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	log1.info("Pass: UserId were selected by entering the E-mail Address");
	ap.emailaddr().clear();
	Thread.sleep(1000);
	ap.emailaddr().sendKeys(prop.getProperty("name"));
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	log1.info("Pass: UserId were selected by entering the Name of the Employee");
	
	}
	
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}
	@AfterMethod
	public void aftmethod(ITestResult result) throws IOException, InterruptedException{
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	    	log1.error("Failed:to select Email");
	    	takeScreenshot();
	    	Thread.sleep(10000);
	       wd.close();
	    }
	 }
	
}
