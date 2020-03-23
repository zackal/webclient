package com.multireq.webclient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GovResponse {
	private String help;
	private boolean success;

	@JsonProperty("result")
	JResult ResultObject;

	// Getter Methods

	public String getHelp() {
		return help;
	}

	public boolean getSuccess() {
		return success;
	}

	public JResult getResult() {
		return ResultObject;
	}

	// Setter Methods

	public void setHelp(String help) {
		this.help = help;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setResult(JResult resultObject) {
		this.ResultObject = resultObject;
	}
}
