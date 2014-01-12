package com.alwalker.mllp_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerManager {

    private Logger logger = LoggerFactory.getLogger(ServerManager.class);
    private ConfigPoller poller;

    public ServerManager(ConfigPoller poller, CreateServerListener onCreate, DeleteServerListener onDelete,
                         ModifyServerListener onChange) {

        this.poller = poller;
        this.poller.addCreateListener(onCreate);
        this.poller.addDeleteListener(onDelete);
        this.poller.addModifyListener(onChange);
    }

    public boolean init() {

        return poller.init();
    }

    public void start() {
        logger.debug("Polling: " + poller.getFriendlyPollLocation());
        poller.start();
    }
}
