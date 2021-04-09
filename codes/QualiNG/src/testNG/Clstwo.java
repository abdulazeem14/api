package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Clstwo {
	@BeforeTest
	@Test
	public void WebCreditcard1() {
		System.out.println("web credit card1");
	}
	@Test
	public void WebCreditcard2() {
		System.out.println("webcreditcard2");
	}
	@Test(dataProvider="datasource")
	public void MobiledebitCardMethod1(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] datasource()
	{
		Object obj[][]=new Object[3][2];
		obj[0][0]="username1";
		obj[0][1]="password1";
		obj[1][0]="username2";
		obj[1][1]="password2";
		obj[2][0]="username3";
		obj[2][1]="password3";
		return obj;
		
	}

}
