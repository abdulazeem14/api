package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReddifLoginpage {
	public ReddifLoginpage(WebDriver wd) {
		this.wd=wd;
	}
	WebDriver wd;
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signin=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	
	public WebElement Email()
	{
		return wd.findElement(username);
	}
	public WebElement Password()
	{
		return wd.findElement(password);
	}
	public WebElement sign()
	{
		return wd.findElement(signin);
	}

}
