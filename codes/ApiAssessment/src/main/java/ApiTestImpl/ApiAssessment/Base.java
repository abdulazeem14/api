package ApiTestImpl.ApiAssessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.annotations.BeforeSuite;




public class Base {
	public static org.apache.logging.log4j.Logger log1;
	String ConsumerKey= null;
	String ConsumerSecretKey=null;
	String AccessToken=null;
	String AccessTokenSecret=null;
	String id="846529860352774144";
	@BeforeSuite
    public void Bsuite() throws FileNotFoundException, IOException{
        String log4jConfigFile = ("C:\\Users\\Qualitest\\Desktop\\selinium_jar\\QTRecognition\\src\\main\\java\\resources\\log4j2.xml");
	//	 String log4jConfigFile = ("/Users/abdulazeem/Desktop/Qualitest/QTRecognition/src/main/java/resources/log4j2.xml");
		ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4jConfigFile));
        Configurator.initialize(null, source);
        log1 = LogManager.getLogger(Base.class.getName());   
	}
	public void precondition() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\ApiTesting\\src\\resources\\data.properties");
	prop.load(fis);
	ConsumerKey=prop.getProperty("ConsumerKey");
	ConsumerSecretKey=prop.getProperty("ConsumerSecretKey");
	AccessToken=prop.getProperty("AccessToken");
	AccessTokenSecret=prop.getProperty("AccessTokenSecret"); 
	}
}
