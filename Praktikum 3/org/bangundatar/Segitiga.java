/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Segitiga.java
* Tanggal Pembuatan		: 08/03/2023
* Deskripsi			: Representasi dari objek persegi panjang, turunan kelas poligon 
*/

package org.bangundatar;

import org.poligon.Poligon; //mengimport file sesuai dengan urutan direktori dari paling luar ke dalam

public class SegitigaSikusiku extends Poligon{
	private double alas,tinggi;
	
	public SegitigaSikusiku(double alas,double tinggi,int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return 0.5 * (alas * tinggi);
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga Sikusiku bersisi "+this.getJumlahSisi());
	}
}
