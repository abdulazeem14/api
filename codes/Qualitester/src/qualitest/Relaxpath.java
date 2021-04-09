package qualitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relaxpath {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\selinium jar\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://makemytrip.com");
		wd.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		wd.findElement(By.xpath("//div[@class='hsw_inputBox tripTypeWrapper']")).getCssValue("div[id='search-widget'] li:nth-child(2)");	
		List<WebElement> li=wd.findElements(By.xpath("//*[@id=\"search-widget\"]/div/div[1]/div"));
		for(WebElement we:li)
		{
			
			System.out.println(we.getText());
			System.out.println("naveen");
		}
		/*try {
			Thread.sleep(50000);
			wd.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}

}
