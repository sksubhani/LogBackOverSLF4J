package com.subhani.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackDemo {

	private static Logger logger = LoggerFactory.getLogger(LogBackDemo.class);
	
	public static void main(String[] args) {
		
		logger.info("This is logger statement using logback framework.");
		new LogBackDemo().echo("Hello, This is printed using logback framework over slf4j.");
	}
	
	private void echo(String message) {
		logger.info("The message received {} ", message);;
	}

}
