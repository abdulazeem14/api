package qualitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_imp_exp {
public static void main(String args[]) throws InterruptedException
{System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Qualitest\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\selinium jar\\\\\\\\\\\\\\\\chromedriver.exe");
	
	WebDriver wd=new ChromeDriver();
	wd.get("https://instagram.com");
	//wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait d=new WebDriverWait(wd,10);
	d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"))).sendKeys("testing");
	
	//wd.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("testing");
Thread.sleep(5000L);

wd.close();
}
}
