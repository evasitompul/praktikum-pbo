/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: Sewa.java
* Tanggal Pembuatan	: 03/05/2023
* Deskripsi		: Kelas yang berisi program untuk kelas Sewa.
*/

import java.util.Scanner;

public class Sewa{
	public static void main (String[] args){
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 2000);
	}
}
