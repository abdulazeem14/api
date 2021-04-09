package Module4;

import java.io.IOException;

import org.testng.annotations.Test;

import Module3.Precondition;
import pageObjects.ActivityPage;
import resources.Base;

public class SearchKudos extends Base{
	@Test
	public void searchKudos(String username,String password) throws IOException
	{
		Precondition pc=new Precondition();
		pc.preCond(username, password);
		ActivityPage ap=new ActivityPage(pc.wd);
		ap.searchkudos().click();
		ap.searchkudos().sendKeys("prasana");
		
		
		
		
	}

}
