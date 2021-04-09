package Module6;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class KudosSent2me extends Base{
	@Test
	public void kudossent2me() throws IOException, InterruptedException
	{
		WebDriver wd=initializeDriver();
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
	ap.kudostome().click();
	Thread.sleep(1000L);
	String kudosfrme=ap.actkudosfrmme().getText();
	String usernamecheck =ap.usernameact().getText();
	String usernameid=ap.usernameId().getText();
	if(usernameid.equals(usernamecheck)&&kudosfrme.equals("received an appreciation from"))
	{
		log1.info("Pass:user is able to see Kudos sent to him from other employees");
		
	}
	else
	{
		log1.fatal("Failed:user is not  able to see Kudos sent to him from other employees");
		takeScreenshot();
	}
	
	wd.close();
		
		
	}
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}
	

}
