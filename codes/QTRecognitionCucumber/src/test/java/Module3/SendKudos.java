package Module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SendKudos extends Base{
	ActivityPage ap;
	@BeforeTest
	public void beforetestcase() throws IOException {
		WebDriver wd=initializeDriver();
		preCondition(wd);
	}
	
	public void sendKudos(String name,WebDriver wd) throws IOException, InterruptedException, AWTException
	{
		
		
		 ap=new ActivityPage(wd);
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
        Thread.sleep(10000);
     
        
        
	}
	
	@Test(dataProvider="validData")
	public void validTestcase(String name,WebDriver wd) throws IOException, InterruptedException, AWTException {
		sendKudos(name,wd);
		
	}
	@Test(dataProvider="invalidData")
	public void invalidTestcase(String name,WebDriver wd) throws IOException, InterruptedException, AWTException {
		sendKudos(name,wd);
	Assert.assertEquals(ap.verifyEmail().getText(),"Please enter receiver email address.");
	log1.info("Passed: Eamail field is mandatory user can't send kudos without email");
		
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
	public Object[] validData(){
		Object data[][]=new Object[1][2];
		data[0][0]="prasana";
		data[0][1]=wd;
		return data;
		
	}
	@DataProvider 
	public Object[] invalidData(){
		Object data[][]=new Object[1][2];
		data[0][0]="";
		data[0][1]=wd;
		return data;
		
	}
	
	
	
	
	
	

}
