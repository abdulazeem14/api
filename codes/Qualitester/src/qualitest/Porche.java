package qualitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Porche {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Qualitest\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\selinium jar\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://porsche.com");
	/*	try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}*/
		wd.findElement(By.xpath("/html/body/div[2]/pag-root/pag-p-country-selector/main/pag-m-country-selector/div/div/div/div/div/label/input")).sendKeys("India");
		wd.findElement(By.xpath("/html/body/div[2]/pag-root/pag-p-country-selector/main/pag-m-country-selector/div/div/div/div/div/label/typeahead-container/ul/li/a")).click();
			List<WebElement> we1=wd.findElements(By.xpath("/html/body/div[2]/pag-root/pag-p-country-selector/main/pag-m-country-selector/div/div/div/ul"));
			for(WebElement webel:we1) {
				System.out.println(webel.getText());
			}
wd.findElement(By.xpath("/html/body/div[2]/pag-root/pag-p-country-selector/main/pag-m-country-selector/div/div/div/div/div/label/input"));
			
			
	}

}
