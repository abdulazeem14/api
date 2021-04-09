package Module1;

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

	@Test(dataProvider="getdata")
	public void logincheck(String username,String password) throws IOException, InterruptedException {
		wd=initializeDriver();
		wd.get(prop.getProperty("url"));
		Hompage hp=new Hompage(wd);
		hp.username().sendKeys(username);
		hp.password().sendKeys(password);
		hp.signin().click();
		Thread.sleep(5000L);
		wd.close();

	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object data[][]=new Object[8][2];
		data[0][0]="azeem.hameed@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		data[1][0]="prasana.renganathan@qualitestgroup.com";
		data[1][1]="invalidpassword";
		data[2][0]="invalidusername@qualitestgroup.com";
		data[2][1]="P@ssw0rd";
		data[3][0]="AZEEM.HAMEED@QUALITESTGROUP.COM";
		data[3][1]="P@SSW0rd";
		data[4][0]="azeem.Hameed@Qualitestgroup.com";
		data[4][1]="P@ssw0rd";
		data[5][0]="";
		data[5][1]="P@ssw0rd";
		data[6][0]="azeem.hameed@qualitestgroup.com";
		data[6][1]="";
		data[7][0]="";
		data[7][1]="";
		
	
		return data;
		
				
	}

}
