package qualitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbtester {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\Chrome\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://facebook.com");
		System.out.println(wd.getTitle());
		//wd.findElement(By.id("email")).sendKeys("testing");
		Thread.sleep(5000);
		wd.findElement(By.cssSelector("input[name='email']")).sendKeys("avinash");
		wd.findElement(By.cssSelector("input[name='pass']")).sendKeys("avinash");
	//	wd.findElement(By.cssSelector("#u_0_d_3H")).click();
		wd.findElement(By.xpath("//*[@id=\"u_0_d_uB\"]")).click();
		//wd.findElement(By.linkText("Create New Account")).click();
		//Keys.chord(Keys.CONTROL+"t");
		//wd.findElement(By.linkText("Forgotten password?")).click();
		//wd.close();
		
		
	}

}
