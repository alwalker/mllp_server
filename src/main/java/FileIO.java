package com.alwalker.mllp_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import static java.nio.file.LinkOption.*;
import java.nio.file.attribute.*;
import java.util.*;

public class FileIO {
	private Logger logger;

	public FileIO() {
		logger = LoggerFactory.getLogger(Server.class);
	}

	public boolean TryCreateServersDirectory() {
		boolean result = true;
		File dir = new File("servers");

		if(!dir.exists()) {
			logger.info("Creating servers directory");
			try {
				result = dir.mkdir();
			}
			catch(Exception e) {
				logger.error("Error creating server directory", e);
				result = false;
			}
		}

		return result;
	}
}