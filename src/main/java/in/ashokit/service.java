package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class service {
	
	private Logger logger = LoggerFactory.getLogger(service.class);
	
	public String getWelcomeMsg()
	{	
		logger.info("getWelcomeMsg() - started...");
		String msg = "Welcome to Ashok IT"; 
		logger.info("getWelcomeMSg() - ended...");
		return msg;	
	}
	

}
