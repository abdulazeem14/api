package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Qualitest\\\\Desktop\\\\selinium jar\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://login.salesforce.com/?locale=eu");
		wd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("salesforce");
		wd.findElement(By.xpath("//input[@name='pw']")).sendKeys("password");

		
		
	}

}
