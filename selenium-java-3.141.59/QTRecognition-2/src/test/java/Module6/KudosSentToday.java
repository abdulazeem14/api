package Module6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Module3.SendKudos;
import pageObjects.ActivityPage;
import resources.Base;

public class KudosSentToday extends Base{
	@Test
public void kudosSentToday() throws IOException, InterruptedException, AWTException {
		wd=initializeDriver();
		preCondition(wd);
		ActivityPage ap=new ActivityPage(wd);
		Thread.sleep(5000L);
		int beforesk=Integer.parseInt(ap.totalkudos().getText().split(" ")[0]);
	SendKudos sk=new SendKudos();
	sk.sendKudos("prasana");
	Thread.sleep(10000L);
	int aftersk=Integer.parseInt(ap.totalkudos().getText().split(" ")[0]);

	
	if(aftersk>beforesk)
	{
		log1.info("Passed:Count value Increased when the ew Kudos were sent");
		
	}
	else{
		log1.error("Failed:To increase Count of Kudos when new Kudos were sent");
	}

}
	

}
