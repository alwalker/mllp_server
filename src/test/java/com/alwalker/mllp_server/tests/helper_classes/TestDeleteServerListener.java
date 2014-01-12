package com.alwalker.mllp_server.tests.helper_classes;

import com.alwalker.mllp_server.DeleteServerListener;
import com.alwalker.mllp_server.ServerConfig;

public class TestDeleteServerListener implements DeleteServerListener {

    private boolean wasCalled = false;

    public boolean getWasCalled() {
        return this.wasCalled;
    }

    public void onDelete(ServerConfig config) {
        wasCalled = true;
    }
}
