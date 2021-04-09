package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Qualitest\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\selinium jar\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://goibibo.com");
	//	wd.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("tri");
		wd.findElement(By.xpath("//input[]")).click();
		
	}

}
