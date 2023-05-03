/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Car.java
* Tanggal Pembuatan	: 03/05/2023
* Deskripsi			: Kelas yang berisi program untuk kelas Car.
*/

import java.util.Scanner;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("Harga sewa mobil = "+fare);
	}
}