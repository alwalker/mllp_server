package com.alwalker.mllp_server.unit_tests;

import com.alwalker.mllp_server.ServerManager;
import com.alwalker.mllp_server.unit_tests.helper_classes.TestCreateServerListener;
import com.alwalker.mllp_server.unit_tests.helper_classes.TestDeleteServerListener;
import com.alwalker.mllp_server.unit_tests.helper_classes.TestModifyServerListener;
import com.alwalker.mllp_server.unit_tests.helper_classes.TestPoller;
import org.junit.Assert;
import org.junit.Test;

public class ServerManagerTests {

    @Test
    public void InitReturnsValueFromPoller() {

        ServerManager mgr = new ServerManager(new TestPoller(), new TestCreateServerListener(),
                new TestDeleteServerListener(), new TestModifyServerListener());

        boolean actual = mgr.init();

        Assert.assertEquals(true, actual);
    }

    @Test
    public void ProperListenersAreCalled() {

        TestCreateServerListener onCreate = new TestCreateServerListener();
        TestModifyServerListener onChange = new TestModifyServerListener();
        TestDeleteServerListener onDelete = new TestDeleteServerListener();
        ServerManager mgr = new ServerManager(new TestPoller(), onCreate, onDelete, onChange);

        mgr.start();

        Assert.assertTrue(onCreate.getWasCalled());
        Assert.assertTrue(onChange.getWasCalled());
        Assert.assertTrue(onDelete.getWasCalled());
    }


}
