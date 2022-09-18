package aplha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class Demo {
	
	private static Logger log1=LogManager.getLogger(Demo.class.getClass());
	@Test 
	public void main1() {
		log1.debug("I am debug message");
		log1.info("I am log info msg");
		log1.error("I am log error message");
		log1.fatal("I am fatal message");
	}

}
