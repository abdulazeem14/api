package Module3;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Hompage;
import resources.Base;

public class Precondition extends Base{
@Test
public void preCond(String username,String password) throws IOException {
	wd=initializeDriver();
	wd.get(prop.getProperty("url"));
	Hompage h=new Hompage(wd);
	h.username().sendKeys(username);
	h.password().sendKeys(password);
	h.signin().click();
	
}



}
