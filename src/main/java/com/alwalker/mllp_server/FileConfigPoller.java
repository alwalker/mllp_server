package com.alwalker.mllp_server;

import java.io.IOException;
import java.util.Properties;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class FileConfigPoller implements ConfigPoller {

	static Logger logger = LoggerFactory.getLogger(FileConfigPoller.class);

	private String configDir;
	private CreateServerListener createListener;
	private DeleteServerListener deleteListener;
	private ModifyServerListener modifyListener;


	public void addCreateListener(CreateServerListener createListener) {

		this.createListener = createListener;
	}

	public void addDeleteListener(DeleteServerListener deleteListener) {

		this.deleteListener = deleteListener;
	}

	public void addModifyListener(ModifyServerListener modifyListener) {

		this.modifyListener = modifyListener;
	}

	public boolean init() {    	

		boolean success = true;
		Properties prop = new Properties();

		try {

			prop.load(Server.class.getClassLoader().getResourceAsStream("config.properties"));

			configDir = prop.getProperty("configDir");
		}
		catch (IOException ex) {
			logger.error("Error accessing config file", ex);
			success = false;
		}

		if (StringUtils.isBlank(configDir)) {

			logger.info("No config directory specified, defaulting to \"servers/\"");
			configDir = "servers/";
		}

		try {

			File dir = new File(configDir);

			if(!dir.exists()) {
				logger.info("Creating servers directory: " + configDir);
				success = dir.mkdir();
			}
		}
		catch(Exception e) {
			logger.error("Error creating server directory", e);
			success = false;
		}

		return success;
	}

	public String getFriendlyPollLocation() {

		return configDir;
	}

	public void start() {

	}	
}