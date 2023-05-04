/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: Bus.java
* Tanggal Pembuatan	: 03/05/2023
* Deskripsi		: Kelas yang berisi program untuk kelas Bus.
*/

import java.util.Scanner;

public class Bus extends Vehicle{
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("Harga sewa Bus = "+fare);
	}
}
