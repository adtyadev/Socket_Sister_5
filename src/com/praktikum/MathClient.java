package com.praktikum;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MathClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = null;
		MathObject asil = null;
		try {
			Scanner input = new Scanner(System.in);
			Socket soket = new Socket("127.0.0.1", 4343);
			OutputStream os = soket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			InputStream is = soket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			float[] a = { 3, 4, 5, 6, 7 };
			float[] b = { 5, 6, 7, 8, 9 };
			System.out.println("Masukan nilai yang ingin dijumlahkan = ");
			String inputUser = input.nextLine();
			//data = new Data(a, b);
			data = new Data(inputUser);
			oos.writeObject(data);
			oos.flush();
			
			asil = (MathObject) ois.readObject();
			System.out.println("Hasil perhitungan : " + asil.getAnswer());
			/*asil = (MathObject) ois.readObject();
			System.out.println("Hasil Penjumlahan : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(asil.getHasil()[i] + ", ");
			}*/
			oos.close();
			ois.close();
			soket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
