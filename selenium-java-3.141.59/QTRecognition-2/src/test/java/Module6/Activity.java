package Module6;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import resources.Base;

public class Activity extends Base{
	
	
	@Test
	public void ActivityPage() throws IOException {
		WebDriver wd=initializeDriver();
		preCondition(wd);
		//ActivityPage ap=new ActivityPage(wd);

		
		
		
	}

}
