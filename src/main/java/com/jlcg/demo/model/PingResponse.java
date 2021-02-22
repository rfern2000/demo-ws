package com.jlcg.demo.model;

import java.util.Date;

public class PingResponse {

	private final Date date;
	private final String input;
	public final String message;
	
	public PingResponse(Date date, String input) {
		this.date = date;
		this.input = input;
	}

	public Date getDate() {
		return date;
	}

	public String getInput() {
		return input;
	}

}
