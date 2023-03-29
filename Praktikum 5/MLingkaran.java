/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: MLingkaran.java
* Tanggal Pembuatan	: 27/02/2023
* Deskripsi			: Implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Jejari lingkaran : ");
		
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		
		System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungLuas());
	}
}