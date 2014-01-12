package com.alwalker.mllp_server.tests.helper_classes;

import com.alwalker.mllp_server.CreateServerListener;
import com.alwalker.mllp_server.ServerConfig;

public class TestCreateServerListener implements CreateServerListener {

    private boolean wasCalled = false;

    public boolean getWasCalled() {
        return this.wasCalled;
    }

    public void onCreate(ServerConfig config) {
        wasCalled = true;
    }
}
