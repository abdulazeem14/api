package Module1;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.Hompage;
import resources.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logincheck extends Base{


	public void logincheck(String username,String password) throws IOException, InterruptedException {
		log1.info("Launching Google chrome Driver version 89 for this test");
		wd=initializeDriver();
		wd.get(prop.getProperty("url"));
		Hompage hp=new Hompage(wd);
		hp.username().sendKeys(username);
		hp.password().sendKeys(password);
		hp.signin().click();
		if(wd.getCurrentUrl().equals(prop.getProperty("url")))
		{
			log1.info("Pass:User are allowed login using username and password");


		}
		else if(!prop.getProperty("password").equals(password))
		{
			if(!wd.getCurrentUrl().equals(prop.getProperty("url")))
			{
				log1.error("Failed:User are able to login success and Password field is CaseInsensitive");


			}
		}
		else {
				takeScreenshot();
				log1.error("Redirectedto a blank page");
		}
		

	}

@Test(dataProvider="invaliddata")
public void invalidTestcases(String username,String password) throws IOException, InterruptedException {
	logincheck(username,password);
	wd.close();
}
@Test(dataProvider="validdata")
public void validTestcases(String username,String password) throws IOException, InterruptedException {
	logincheck(username,password);
	wd.close();
	
}

	
	@DataProvider
	public Object[][] validdata()
	{
		Object data[][]=new Object[6][2];
		data[0][0]="azeem.hameed@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		data[1][0]="prasana.renganathan@qualitestgroup.com";
		data[1][1]="P@ssw0rd";
		data[2][0]="AZEEM.HAMEED@QUALITESTGROUP.COM";
		data[2][1]="P@ssw0rd";
		return data;
		
				
	}
	
	@DataProvider
	public Object[][] invaliddata()
	{
		Object data[][]=new Object[12][2];
		data[0][0]="azeem.hameed@qualitestgroup.com";
		data[0][1]="invalidpassword";
		data[1][0]="invalidusername@qualitestgroup.com";
		data[1][1]="P@ssw0rd";
		data[2][0]="azeem.Hameed@Qualitestgroup.com";
		data[2][1]="P@SSW0RD";
		data[3][0]="";
		data[3][1]="P@ssw0rd";
		data[4][0]="azeem.hameed@qualitestgroup.com";
		data[4][1]="";
		data[5][0]="";
		data[5][1]="";
		
	 
		return data;
				
	}
	@AfterMethod
	public void aftmethod(ITestResult result){
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	    	
	       wd.close();
	    }
	 }
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}

	

}
