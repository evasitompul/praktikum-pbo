/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: MPoligon.java
* Tanggal Pembuatan	: 08/03/2023
* Deskripsi			: driver class untuk poligon dan persegi panjang
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	
		SegitigaSikusiku segitiga = new SegitigaSikusiku(15,8,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga Siku-siku : "+segitiga.hitungLuas());
	
	}
}
