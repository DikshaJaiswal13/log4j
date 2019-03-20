package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class sample2 {
	
	static final Logger logger=Logger.getLogger(sample2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BasicConfigurator.configure(); //log all messages on the console,,default consoleappender,patternlayout
		PropertyConfigurator.configure("log1.properties");
		logger.debug("sample debug message");
		logger.info("sample info message");
		logger.warn("sample warn message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		
		
	}

}
