package com.alwalker.mllp_server;

public interface ConfigPoller {
	void addCreateListener(CreateServerListener createListener);
	void addDeleteListener(DeleteServerListener deleteListener);
	void addModifyListener(ModifyServerListener modifyListener);
}