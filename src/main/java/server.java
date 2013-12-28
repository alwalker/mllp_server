package com.alwalker.mllp_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Server {
	static FileIO fileIO = new FileIO();
	static Logger logger = LoggerFactory.getLogger(Server.class);

	public static void main(String[] args) {
		logger.info("Checking for server directory");
		boolean created = fileIO.TryCreateServersDirectory();
		if(!created) {
			logger.debug("Could not create server directory, exiting");
			System.exit(-1);
		}


		logger.info("success!");
	}
}
