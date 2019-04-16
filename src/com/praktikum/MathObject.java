package com.praktikum;

import java.io.Serializable;
import javax.script.*;
public class MathObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer answer =null;
	
	public void jumlah(Data input) {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try {
			String inputUser = input.getData();
			this.answer = (Integer) engine.eval(inputUser);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
	
	public Integer getAnswer() {
		return this.answer;
	}
}
