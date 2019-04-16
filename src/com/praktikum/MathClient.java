package com.praktikum;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MathClient {

	public static void main(String[] args) {
		Data data = null;
		MathObject asil = null;
		try {
			Scanner input = new Scanner(System.in);
			Socket soket = new Socket("127.0.0.1", 4343); 
			
			/*membuat socket dan output&input stream untuk komunikasi data*/
			OutputStream os = soket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			InputStream is = soket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			/*Meminta user untuk memasukan inputan nilai yang ingin dioperasikan*/
			System.out.println("Masukan nilai yang ingin dijumlahkan =  (1+8*4/2-4)");
			String inputUser = input.nextLine();
			
			/*Kirim data ke server dan menerima kembali hasil dari server*/
			data = new Data(inputUser);
			oos.writeObject(data);
			oos.flush();
			asil = (MathObject) ois.readObject();
			
			System.out.println("Hasil perhitungan : " + asil.getAnswer());
			//Tutup semua fungsi yang digunakaan
			oos.close();
			ois.close();
			soket.close();
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
