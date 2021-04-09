package log4j;
import org.apache.logging.log4j.*;
public class Log4jtest {


public static Logger log=LogManager.getLogger(Log4jtest.class.getName());
	
	public static void main(String args[])
	{
			log.error("unable to click on the browser");
			log.fatal("fatal error displayed");
			log.info("successfully entered username and password");
			log.debug("debug information displayed");
	}
}
