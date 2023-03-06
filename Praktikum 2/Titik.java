/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Titik.java
* Tanggal Pembuatan	: 22/02/2023
* Deskripsi			: Kelas Titik 
*/

class Titik{
	// atribut
	private double absis; // absis
	private double ordinat; // ordinat
	private static int counterTitik; // penghitung objek titik yang telah dibuat
	
	// konstruktor
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;	
	}
	
	// overloading konstruktor
	public Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;	
	}
	
	// metode
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	public int getCounterTitik(){
		return counterTitik;
	}	
}