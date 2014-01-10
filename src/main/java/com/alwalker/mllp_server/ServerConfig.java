package com.alwalker.mllp_server;

public class ServerConfig {

	public enum FrameEncodingType { ASCII, HEX }

	private String id;
	private String listenerAddress;
	private int listenerPort;
	private int recieveTimeout;
	private int bufferSize;
	private boolean processBatch;
	private FrameEncodingType llpFrameEncodingType;
	private char startOfMessageChar;
	private char endOfMessageChar;
	private char recordSeparatorChar;
	private char endOfSegmentChar;
	private String encoding;
	private boolean sendACK;
	private String successfulACKCode;
	private String successfulACKMessage;
	private String errorACKCode;
	private String errorACKMessage;
	private String rejectedACKCode;
	private String rejectedACKMessage;
	private boolean ackOnNewConnection;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getListenerAddress() {
		return this.listenerAddress;
	}
	public void setListenerAddress(String address) {
		this.listenerAddress = address;
	}

	public int getListenerPort() {
		return this.listenerPort;
	}
	public void setListenerPort(int port) {
		this.listenerPort = port;
	}

	public int getRecieveTimeout() {
		return this.recieveTimeout;
	}
	public void setRecieveTimeout(int recieveTimeout) {
		this.recieveTimeout = recieveTimeout;
	}

	public int getBufferSize() {
		return this.bufferSize;
	}
	public void setBufferSize(int bufferSize) {
		this.bufferSize = bufferSize;
	}

	public boolean getProcessBatch() {
		return this.processBatch;
	}
	public void setProcessBatch(boolean processBatch) {
		this.processBatch = processBatch;
	}

	public FrameEncodingType getLLPFrameEncodingType() {
		return this.llpFrameEncodingType;
	}
	public void setLLPFrameEncodingType(FrameEncodingType llpFrameEncodingType) {
		this.llpFrameEncodingType = llpFrameEncodingType;
	}

	public char getStartOfMessageChar() {
		return this.startOfMessageChar;
	}
	public void setStartOfMessageChar(char startOfMessageChar) {
		this.startOfMessageChar = startOfMessageChar;
	}

	public char getEndOfMessageChar() {
		return this.endOfMessageChar;
	}
	public void setEndOfMessageChar(char endOfMessageChar) {
		this.endOfMessageChar = endOfMessageChar;
	}

	public char getRecordSeparatorChar() {
		return this.recordSeparatorChar;
	}
	public void setRecordSeparatorChar(char recordSeparatorChar) {
		this.recordSeparatorChar = recordSeparatorChar;
	}

	public char getEndOfSegmentChar() {
		return this.endOfSegmentChar;
	}
	public void setEndOfSegmentChar(char endOfSegmentChar) {
		this.endOfSegmentChar = endOfSegmentChar;
	}

	public String getEncoding() {
		return this.encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public boolean getSendACK() {
		return this.sendACK;
	}
	public void setSendACK(boolean sendACK) {
		this.sendACK = sendACK;
	}

	public String getSuccessfulACKCode() {
		return this.successfulACKCode;
	}
	public void setSuccessfulACKCode(String successfulACKCode) {
		this.successfulACKCode = successfulACKCode;
	}

	public String getSuccessfulACKMessage() {
		return this.successfulACKMessage;
	}
	public void setSuccessfulACKMessage(String successfulACKMessage) {
		this.successfulACKMessage = successfulACKMessage;
	}

	public String getErrorACKCode() {
		return this.errorACKCode;
	}
	public void setErrorACKCode(String errorACKCode) {
		this.errorACKCode = errorACKCode;
	}

	public String getErrorACKMessage() {
		return this.errorACKMessage;
	}
	public void setErrorACKMessage(String errorACKMessage) {
		this.errorACKMessage = errorACKMessage;
	}

	public String getRejectedACKCode() {
		return this.errorACKCode;
	}
	public void setRejectedACKCode(String rejectedACKCode) {
		this.rejectedACKCode = rejectedACKCode;
	}

	public String getRejectedACKMessage() {
		return this.rejectedACKMessage;
	}
	public void setRejectedACKMessage(String rejectedACKMessage) {
		this.rejectedACKMessage = rejectedACKMessage;
	}

	public boolean getACKOnNewConnection() {
		return this.ackOnNewConnection;
	}
	public void setACKOnNewConnection(boolean ackOnNewConnection) {
		this.ackOnNewConnection = ackOnNewConnection;
	}
}