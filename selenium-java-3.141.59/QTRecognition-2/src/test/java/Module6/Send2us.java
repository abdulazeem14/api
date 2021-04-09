package Module6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
		sk.sendKudos(name);
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
			log1.error("Failed:User should not be allowed to send kudos to himself/herself");
			System.out.println("checked");
		}
		else
		{
			log1.fatal("Failed:user is not  able to see Kudos sent to him form other employees");
		}
		
		}
	
		
		
		
		
	
	@DataProvider
	public Object[] getData() {
		Object data[]=new Object[1];
		data[0]="azeem";
		return data;
		
	}
	

}
