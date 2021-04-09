package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\selinium_jar\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//wd.manage().window().maximize();
		wd.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[4]/ul/li/span/a/div/label/i")).click();
	}

}
