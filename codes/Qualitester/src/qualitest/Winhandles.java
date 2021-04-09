package qualitest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Winhandles {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Qualitest\\Desktop\\selinium_jar\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	//System.out.println(wd.getTitle());
	wd.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
	Set<String> ids=wd.getWindowHandles();
	Iterator<String> it=ids.iterator();
	while(it.hasNext())
	{
		System.out.println(wd.getTitle());
		wd.switchTo().window(it.next());
		System.out.println(wd.getTitle());
		System.out.println(it.next());
		
	}
//	String parentid=it.next();
//	String childid=it.next();
//	wd.switchTo().window(childid);
//	System.out.println(wd.getTitle());
//	wd.switchTo().window(parentid);
//System.out.println(wd.getTitle());
//Thread.sleep(5000L);
wd.quit();
	
	
}
}
