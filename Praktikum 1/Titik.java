/**
* File		:Titik.java 22/02/2023
* Nama		:Eva Sitompul
* NIM		:24060119120035
* Deskripsi	:Kelas Titik 
*/

class Titik{
	// atribut
	double absis; // absis
	double ordinat; // ordinat
	static int counterTitik; // penghitung objek titik yang telah dibuat
	
	// konstruktor
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;	
	}
	
	// overloading konstruktor
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;	
	}
	
	// metode
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double o){
		ordinat = o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	static int getCounterTitik(){
		return counterTitik;
	}	
}