package com.alwalker.mllp_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

class Server {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Server.class);
    	logger.info("Hello World");

		// LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
  //       StatusPrinter.print(lc);
	}
}
