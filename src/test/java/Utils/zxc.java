package Utils;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;

import Base.BaseClass;

public class zxc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LogManager.getLogger(zxc.class);
		//DOMConfigurator.configure("log4j2.xml");
		PropertyConfigurator.configure("C:\\Users\\navee\\eclipse-workspace\\New space\\HybridProject\\src\\test\\resources\\log4j2.properties");
		
		  logger.trace("the built-in TRACE level");
	    
	        logger.debug("the built-in DEBUG level");
	    
	        logger.info("the built-in INFO level");
	      
	        logger.warn("the built-in WARN level");
	        logger.error("the built-in ERROR level");
	        logger.fatal("the built-in FATAL level");
	      

	}

}
