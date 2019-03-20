package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class sample1 {
	
	static final Logger logger=Logger.getLogger(sample1.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BasicConfigurator.configure(); //log all messages on the console,,default consoleappender,patternlayout
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("sample debug message");
		logger.info("sample info message");
		logger.warn("sample warn message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		
		
	}

}
