/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: Lingkaran.java
* Tanggal Pembuatan	: 27/02/2023
* Deskripsi		: Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

//mengambil konstanta yang ada di kelas java.lang.Match
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}
