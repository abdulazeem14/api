package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Qualitest\\\\\\\\Desktop\\\\\\\\selinium jar\\\\\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.instagram.com");
		try {
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("testinsta");
	}
}
