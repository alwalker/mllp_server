package com.alwalker.mllp_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.Properties;

public class Server {

	static Logger logger = LoggerFactory.getLogger(Server.class);

	public static void main(String[] args) {
		Properties prop = new Properties();

		try {

			prop.load(Server.class.getClassLoader().getResourceAsStream("config.properties"));

			logger.info("directory to watch: " + prop.getProperty("configDir"));
		}
		catch (IOException ex) {
    		ex.printStackTrace();
        }

		logger.info("success!");
	}
}
