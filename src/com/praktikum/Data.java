package com.praktikum;

import java.io.Serializable;

public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String input = null;

	public Data(String inputUser) {
		super();
		this.input = inputUser;
	}
	
	public String getData() {
		return this.input;
	}
}
