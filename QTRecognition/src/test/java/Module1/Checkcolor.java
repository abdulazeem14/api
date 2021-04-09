package Module1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.Hompage;
import resources.Base;

public class Checkcolor extends Base {
	@Test
	public void checkcolor() throws IOException {
		wd=initializeDriver();
		wd.get(prop.getProperty("url"));
	Set<String> colors=new HashSet<String>();
	colors.add("#FECC160");
	colors.add("#2A2559");
	colors.add("#939598");
	Hompage hp=new Hompage(wd);
	String golden=Color.fromString(hp.titleColor().getCssValue("background-color")).asHex();
	String grey=Color.fromString(hp.bodyColor().getCssValue("background-color")).asHex();
	String navy=Color.fromString(hp.buttonColor().getCssValue("background-color")).asHex();
	
	
	if(colors.contains(golden))
	{
		log1.info("#FECC160 element color used in home page is approved by  Qualitest primary colors");
	}
	else
	{
		takeScreenshot();
		log1.error("#fdcc16 element color used in home page is not approved by Qualitest primary colors.");
		
	}
	if(colors.contains(grey))
	{
		log1.info("#939598 element color used in home page is approved by  Qualitest primary colors");
		}
	else
	{
		takeScreenshot();
		log1.error("#fff element color used in home page is not approved by Qualitest primary colors.");
		
	}
	if(colors.contains(navy)) {
		log1.info("#2A2559 element color used in home page is approved by  Qualitest primary colors");
	}
	else
	{
	takeScreenshot();
	log1.error("#2a2559 element color used in home page is not approved by Qualitest primary colors");
	}
	
	
	
	
	
	}
	
	@AfterTest
	public void closebrowser()
	{
		wd.close();
	}
}
