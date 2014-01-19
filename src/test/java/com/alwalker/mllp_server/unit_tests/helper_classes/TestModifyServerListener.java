package com.alwalker.mllp_server.unit_tests.helper_classes;

import com.alwalker.mllp_server.ModifyServerListener;
import com.alwalker.mllp_server.ServerConfig;

public class TestModifyServerListener implements ModifyServerListener {

    private boolean wasCalled = false;

    public boolean getWasCalled() {
        return this.wasCalled;
    }

    public void onModify(ServerConfig config) {
        wasCalled = true;
    }
}
