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
import org.testng.annotations.BeforeSuite;

public class Base {
	public static org.apache.logging.log4j.Logger log1;
	public WebDriver wd;
	public Properties prop;
	@BeforeSuite
    public void Bsuite() throws FileNotFoundException, IOException{
        String log4jConfigFile = ("C:\\Users\\Qualitest\\Documents\\QTRecognition\\src\\main\\java\\resources\\log4j2.xml");
        ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4jConfigFile));
        Configurator.initialize(null, source);
        log1 = LogManager.getLogger(Base.class.getName());   
	}
	public void takeScreenshot() throws IOException
	{
		Random ran=new Random();
		String val="screenshot"+ran.nextInt(1000)+new Date().toString();
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Desktop\\ss\\sc12.png"));
	}
	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\Documents\\QTRecognition\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browsername");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Desktop\\selinium_jar\\chromedriver.exe");
			wd=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			wd=new FirefoxDriver();
		}
		return wd;
	}
	
	
	

}
