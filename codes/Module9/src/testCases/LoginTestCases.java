package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.ReddifLoginpage;

public class LoginTestCases {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Qualitest\\Desktop\\selinium_jar\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
				ReddifLoginpage rlp=new ReddifLoginpage(wd);
				rlp.Email().sendKeys("Qualitest@gmail.com");
				rlp.Password().sendKeys("Password@quali");
				rlp.sign().click();
				
				
		
		
	}

}
