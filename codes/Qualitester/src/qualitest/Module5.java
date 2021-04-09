package qualitest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Module5 {
public static void  main(String args[]) throws IOException
{
	DesiredCapabilities ch=DesiredCapabilities.chrome();
	ch.acceptInsecureCerts();
	ChromeOptions c=new ChromeOptions();
	c.merge(ch);
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Qualitest\\\\\\\\Desktop\\\\\\\\selinium_jar\\\\\\\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.spacex.com/");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Desktop\\ss\\Screenshot1.png"));
	//WindowsUtils.killByName("excel.exe");
	
}
}
