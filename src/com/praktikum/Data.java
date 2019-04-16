package com.praktikum;

import java.io.Serializable;

public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float a[] = null;
	private float b[] = null;
	private String input = null;

	public Data(String inputUser) {
		super();
//		this.a = a;
//		this.b = b;
		this.input = inputUser;
	}
	
	public String getData() {
		return this.input;
	}
	
	public float[] getA() {
		return a;
	}

	public void setA(float[] a) {
		this.a = a;
	}

	public float[] getB() {
		return b;
	}

	public void setB(float[] b) {
		this.b = b;
	}
}
