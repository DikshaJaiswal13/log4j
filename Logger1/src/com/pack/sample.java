package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class sample {
	
	static final Logger logger=Logger.getLogger(sample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure(); //log all messages on the console,,default consoleappender,patternlayout
		logger.debug("sample debug message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		logger.info("sample info message");
		logger.warn("sample warn message");
	}

}
