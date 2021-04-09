package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Hompage extends Base{
	WebDriver wd;
	By username=By.xpath("//input[@name='username']");
	 By password=By.xpath("//input[@name='pass']");
	 By signin=By.xpath("/html/body/div[2]/form/button");
	 By titlecolor=By.xpath("/html/body/div[1]");
	 By  bodycolor=By.xpath("/html/body/div[2]");
	 By buttoncolor=By.xpath("/html/body/div[2]/form/button");
	public Hompage(WebDriver wd) {
		this.wd=wd;

	}
	public WebElement username()
	{
 return wd.findElement(username);		
	}
	public WebElement password()
	{
		return wd.findElement(password);
	}
	public WebElement signin()
	{
		return wd.findElement(signin);
	}
	public WebElement titleColor()

	{
		return wd.findElement(titlecolor);
	}
	public WebElement bodyColor()
	{
		return wd.findElement(bodycolor);
	}
	public WebElement buttonColor()
	{
		return wd.findElement(buttoncolor);
	}

}
