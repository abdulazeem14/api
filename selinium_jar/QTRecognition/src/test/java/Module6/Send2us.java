package Module6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Module3.SendKudos;
import pageObjects.ActivityPage;
import resources.Base;

public class Send2us extends Base{
	
	@Test(dataProvider="getData")
	public void send2us(String name) throws IOException, InterruptedException, AWTException {
		WebDriver wd=initializeDriver();
		SendKudos sk=new SendKudos();
		sk.sendKudos(name,wd);
		sk.wd.close();
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
		Thread.sleep(1000L);
		ap.kudostome().click();
		Thread.sleep(5000L);
		String sender =ap.usernameact().getText();
		String recepient=ap.recepient().getText();
		if(sender.equals(recepient))
		{
			takeScreenshot();
			log1.error("Failed:User is sending kudos to himself/herself it should not send as per Requirement");
			
		}
		else
		{
			log1.info("pass: User is not able to send Kudos to himself/herself");
		}
		
		}
	
		
		
		
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}
	
	@DataProvider
	public Object[] getData() {
		Object data[]=new Object[1];
		data[0]="azeem";
		return data;
		
	}
	

}
