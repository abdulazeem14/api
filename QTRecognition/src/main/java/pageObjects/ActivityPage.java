package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class ActivityPage extends Base {
	WebDriver wd;
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='pass']");
	By signin=By.xpath("/html/body/div[2]/form/button");
	By usernameId=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/h5");
	 By sendKudos=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
	 By emailaddr=By.xpath("//*[@id=\"email_address\"]");
	 By kudos=By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
	 By comments=By.xpath("//*[@id=\"comment\"]");
	 By send=By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
	 By activity=By.xpath("//*[@id=\"0\"]/div/h5");
	 By Recentkudos=By.xpath("//*[@id=\"contact_list\"]/div[2]/div/h5/small/a/i");
	 By findKudos=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span");
	 By searchkudos=By.xpath("//input[@name='email_address']");
	 By ksearchbutton=By.xpath("//*[@id=\"search_panel\"]/button");
	 
	 public void kudosType(String kudosType) {
	WebElement kudoType=wd.findElement(By.xpath("//i[contains(text(),'"+kudosType+"')]/ancestor::center"));
	kudoType.click();
	 }
	
	 
	 
	public ActivityPage(WebDriver wd) {
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
	public WebElement sendKudos() {
		return wd.findElement(sendKudos);
	}
	public WebElement emailaddr() {
		return wd.findElement(emailaddr);
	}
	public WebElement kudos() {
		return wd.findElement(kudos);
	}
	public WebElement comments() {
		return wd.findElement(comments);
	}
	public WebElement send()
	{
		return wd.findElement(send);
	}
	public WebElement activitypage()
	{
		return wd.findElement(activity);
	}
	public WebElement recentKudos()
	
	{
		return wd.findElement(Recentkudos);
	}
	public WebElement usernameId()
	{
		return wd.findElement(usernameId);
	}
	public WebElement findKudos()
	{
		return wd.findElement(findKudos);
	}
	public WebElement searchkudos() {
		return wd.findElement(searchkudos);
		
	}
	public WebElement ksearchbutton() {
		return wd.findElement(ksearchbutton);
	}
	
	
	

}
