/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: MBujurSangkar.java
* Tanggal Pembuatan	: 27/03/2023
* Deskripsi		: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}
