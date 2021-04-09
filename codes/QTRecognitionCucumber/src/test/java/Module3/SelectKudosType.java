package Module3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class SelectKudosType extends Base{
	@Test
	public void selectkudos() throws IOException, InterruptedException
	{
		WebDriver wd=initializeDriver();
		preCondition(wd);
		
//		Precondition pc=new Precondition();
//		pc.preCond(username, password);
//		log1.info("Precondition:Login with valid UserName and Password in QTRecognition");
		ActivityPage ap=new ActivityPage(wd);
		ap.sendKudos().click();
		ap.send();
		log1.info("Kudos type is mandatory field user should select one kudos");
		Thread.sleep(1000);
		ArrayList<String> kudostype=new ArrayList<>();
		kudostype.add("Exceptional Work");
		kudostype.add("Excellent Team Work");
		kudostype.add("Innovative Thinker");
		kudostype.add("Good Client Relations");
		kudostype.add("Quality Hero");
		kudostype.add("Quick Learner");
		kudostype.add("Hard Worker");
		kudostype.add("Team player");
		Iterator itr=kudostype.iterator();
		while(itr.hasNext())
		{
			ap.kudosType(itr.next().toString());
			Thread.sleep(1000);
		}
		log1.error("Multiple Kudos were selected but Only 1 kudos type should be selected according to testcase ");
		takeScreenshot();
		
		
		
		
		
		
	}
@AfterTest
public void closeBrowser() {
	wd.close();
}
	
	@DataProvider
	public Object[][]  validdata(){
		Object[][] validuser=new Object[1][2];
		validuser[0][0]="azeem.hameed@qualitestgroup.com";
		validuser[0][1]="P@ssw0rd";
		return validuser;
		
	}
}
