package Module6;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class KudosFrmMe extends Base{
	@Test
	public void kudosFrmMe() throws IOException, InterruptedException
	{
		WebDriver wd=initializeDriver();
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
		ap.kudosfromme().click();
		Thread.sleep(5000L);
		String kudosfrme=ap.actkudosfrmme().getText();
		String usernamecheck =ap.usernameact().getText();
		String usernameid=ap.usernameId().getText();
		if(usernameid.equals(usernamecheck)&&kudosfrme.equals("has sent an appreciation to"))
		{
			log1.info("Pass:user is able to see Kudos sent from him to other employees");
			System.out.println("checked");
		}
		else
		{
			log1.fatal("Failed:user is not  able to see Kudos sent from him to other employees");
		}
		
		
		
		
		
	
		
	}
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}
	

}
