 package Module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SelectEmailaddress extends Base{
	Precondition pc=new Precondition();
	@Test(dataProvider="validdata")
	public void pre(String username,String password) throws IOException, InterruptedException, AWTException
	{
		
		Precondition pc=new Precondition();
		pc.preCond(username, password);		
		
	
	ActivityPage ap=new ActivityPage(pc.wd);
	Thread.sleep(1000);
	ap.sendKudos().click();
	
	Robot robot=new Robot();
	Thread.sleep(1000);
	ap.emailaddr().click();
	ap.emailaddr().sendKeys(prop.getProperty("username"));
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	ap.emailaddr().clear();
	Thread.sleep(1000);
	ap.emailaddr().sendKeys(prop.getProperty("name"));
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	}
	
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}
	
}
