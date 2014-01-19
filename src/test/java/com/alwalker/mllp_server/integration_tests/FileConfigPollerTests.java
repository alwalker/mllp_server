package com.alwalker.mllp_server.integration_tests;

import com.alwalker.mllp_server.FileConfigPoller;
import org.junit.Assert;
import org.junit.Test;

public class FileConfigPollerTests {

    @Test
    public void getFriendlyPollLocationReturnsValueFromConfigFile() {

        FileConfigPoller poller = new FileConfigPoller();
        poller.init();

        String actual = poller.getFriendlyPollLocation();

        Assert.assertEquals("servers/", actual);
    }
}
