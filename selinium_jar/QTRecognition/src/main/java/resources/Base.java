package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import pageObjects.Hompage;

public class Base {
	public static org.apache.logging.log4j.Logger log1;
	public WebDriver wd;
	public Properties prop;
	
	
	
	
	@BeforeSuite
    public void Bsuite() throws FileNotFoundException, IOException{
        String log4jConfigFile = ("C:\\Users\\Qualitest\\eclipse-workspace\\ApiAssessment\\src\\main\\java\\resources\\log4j2.xml");
	//	 String log4jConfigFile = ("/Users/abdulazeem/Desktop/Qualitest/QTRecognition/src/main/java/resources/log4j2.xml");
		ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4jConfigFile));
        Configurator.initialize(null, source);
        log1 = LogManager.getLogger(Base.class.getName());   
	}
	
	
	
	
	public void takeScreenshot() throws IOException
	{
		Random ran=new Random();
		String val="screenshot"+ran.nextInt(1000);
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Desktop\\ss\\"+val+".png"));
		//FileUtils.copyFile(src, new File("/Users/abdulazeem/Desktop/qtscreenshot/"+val+".png"));
	}
	
	
	
	
	
	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\Desktop\\selinium_jar\\QTRecognition\\src\\main\\java\\resources\\data.properties");
	//	FileInputStream fis=new FileInputStream("/Users/abdulazeem/Desktop/Qualitest/QTRecognition/src/main/java/resources/data.properties");

		prop.load(fis);
		String browsername=prop.getProperty("browsername");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\selinium_jar\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "/Users/abdulazeem/Downloads/chromedriver");
			wd=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			wd=new FirefoxDriver();
		}

		else
		{
			wd=new InternetExplorerDriver();
		}
		return wd;
	}
	
	
	
	
	public void preCondition(WebDriver wd) throws IOException
	{
		wd.get(prop.getProperty("url"));
		Hompage h=new Hompage(wd);
		h.username().sendKeys(prop.getProperty("username"));
		h.password().sendKeys(prop.getProperty("password"));
		h.signin().click();
		
	}
	
	
	

}
