package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Qualitest\\\\Desktop\\\\selinium_jar\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.path2usa.com/travel-companions");

		wd.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
	while(wd.findElement(By.xpath("//*[@id=\"google_ads_top_frame_ctrl\"]")).getText().contains("March 2021")) {
		wd.findElement(By.xpath("//*[@id=\"travel_from\"]")).click();
	}
		
	
		
		int count=wd.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=wd.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("31"))
			{
				wd.findElements(By.className("day")).get(i).click();
				break;
				
			
				
			}
		}
//		wd.findElement(By.xpath("//td[contains(text(),'18')]")).click();
		Thread.sleep(10000);
		wd.quit();
		
	}
}


