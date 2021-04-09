package Module1;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Hompage;
import resources.Base;

public class SessionTest extends Base{
@Test(dataProvider="validdata")
public void sessionTimeOut(String username,String password) throws IOException, InterruptedException
{
	wd=initializeDriver();
	wd.get(prop.getProperty("url"));
	log1.info("Launching Google chrome Driver version 89 for this test");
	Hompage hp=new Hompage(wd);
	hp.username().sendKeys(username);
	hp.password().sendKeys(password);
	hp.signin().click();
	log1.info("Login success");
	wd.navigate().back();
	hp.username().clear();
	hp.password().clear();
	log1.info("Navigating back using Browser Back button");
	wd.navigate().forward();
	log1.info("clear the input fields and Navigate forward using forward button in Browser");
	log1.info("Previous Login session Should be closed and display pop-up message that input field's are empty");
	log1.error("Login is successful and page is redirected to QTRecognition Activities");
	Thread.sleep(1000L);
	wd.close();
	
	
	
}
@DataProvider
public Object[][]  validdata(){
	Object[][] validuser=new Object[1][2];
	validuser[0][0]="azeem.hameed@qualitestgroup.com";
	validuser[0][1]="P@ssw0rd";
	return validuser;
	
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
