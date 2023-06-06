/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Lingkaran.java
* Tanggal Pembuatan	: 17/05/2023
* Deskripsi			: implementasi lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}