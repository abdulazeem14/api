package Module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SendKudos extends Base{
	
	@Test(dataProvider="getData")
	public void sendKudos(String name) throws IOException, InterruptedException, AWTException
	{
		
		WebDriver wd=initializeDriver();
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
		ap.sendKudos().click();
		Thread.sleep(5000L);
		//ap.emailaddr().sendKeys("prasana")+Keys.chord(Keys.ARROW_DOWN)+Keys.chord(Keys.ENTER));
		ap.emailaddr().sendKeys(name);
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
        ap.comments().sendKeys(prop.getProperty("comments"));
        ap.send().click();
     
        
        
	}
	
	public void sendKudos(WebDriver wd,String name,String comments) throws IOException, InterruptedException, AWTException
	{
		
		
		ActivityPage ap=new ActivityPage(wd);
		ap.sendKudos().click();
		Thread.sleep(5000L);
		//ap.emailaddr().sendKeys("prasana")+Keys.chord(Keys.ARROW_DOWN)+Keys.chord(Keys.ENTER));
		ap.emailaddr().sendKeys(name);
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
        ap.comments().sendKeys(comments);
        ap.send().click();
     
        
        
	}
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}
	@DataProvider 
	public Object[] getData(){
		Object data[]=new Object[1];
		data[0]="prasana";
		return data;
		
	}
	
	
	
	
	

}
