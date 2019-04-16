package com.praktikum;

import java.io.Serializable;
import javax.script.*;
public class MathObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float hasil[] = null;
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
	
	/*public void jumlah(Data a) {
		if (a.getA().length != a.getB().length) {
			return;
		} else {
			float[] x = a.getA();
			float[] y = a.getB();
			hasil = new float[x.length];
			for (int i = 0; i < x.length; i++) {
				hasil[i] = x[i] + y[i];
			}
		}
	}

	public float[] getHasil() {
		return this.hasil;
	}*/
}
