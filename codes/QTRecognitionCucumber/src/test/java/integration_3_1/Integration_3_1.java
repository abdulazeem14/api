package integration_3_1;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Module3.SendKudos;
import Module3.SendKudosRecentContacts;
import Module4.SearchKudos;
import resources.Base;

public class Integration_3_1 extends Base{
	@Test
	public void integrationfirst() throws IOException, InterruptedException, AWTException {
		WebDriver wd=initializeDriver();
		preCondition(wd);
		SendKudos sk=new SendKudos();
		sk.sendKudos(wd,prop.getProperty("integrationname"), prop.getProperty("comm"));
		Thread.sleep(10000);
		SendKudosRecentContacts skrc=new SendKudosRecentContacts();
		skrc.sendkudosrecentcontacts(1,wd);
	}

}
