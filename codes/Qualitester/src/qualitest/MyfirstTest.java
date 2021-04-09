package qualitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyfirstTest {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\selinium jar\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://google.com");
		System.out.println(webdriver.getTitle());
		
		System.out.println(webdriver.getCurrentUrl());
		//System.out.println(webdriver.getPageSource());
		webdriver.navigate().to("https://duckduckgo.com");
		webdriver.navigate().back();
		webdriver.navigate().forward();
		//webdriver.close();
		webdriver.quit();
		
	}
}
	