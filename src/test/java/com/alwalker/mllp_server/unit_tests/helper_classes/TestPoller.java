package com.alwalker.mllp_server.unit_tests.helper_classes;

import com.alwalker.mllp_server.*;

public class TestPoller implements ConfigPoller {

    private CreateServerListener onCreate;
    private DeleteServerListener onDelete;
    private ModifyServerListener onChange;

    public void addCreateListener(CreateServerListener createListener) {
        onCreate = createListener;
    }

    public void addDeleteListener(DeleteServerListener deleteListener) {
        onDelete = deleteListener;
    }

    public void addModifyListener(ModifyServerListener modifyListener) {
        onChange = modifyListener;
    }

    public boolean init() {
        return true;
    }

    public String getFriendlyPollLocation() {
        return "";
    }

    public void start() {

        ServerConfig cfg = new ServerConfig();
        cfg.setBufferSize(1000);

        onCreate.onCreate(cfg);
        onDelete.onDelete(cfg);
        onChange.onModify(cfg);
    }
}
