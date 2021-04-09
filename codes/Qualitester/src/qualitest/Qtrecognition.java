package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtrecognition {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Qualitest\\\\Desktop\\\\selinium jar\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://qtrecognition.testqtwiz.com/");
		System.out.println(wd.getTitle());
		wd.findElement(By.xpath("//input[@name='username']")).sendKeys("Pranesh.dixit@qualitestgroup.com");
		wd.findElement(By.xpath("//input[@name='pass']")).sendKeys("P@ssw0rd");
		wd.findElement(By.xpath("/html/body/div[2]/form/button")).click();	
		
	}

}
