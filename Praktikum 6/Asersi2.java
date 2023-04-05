/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Asersi2.java
* Tanggal Pembuatan	: 29/03/2023
* Deskripsi			: Program untuk demo asersi, yang akan menolak input
					jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling Lingkaran = "+kelilingLingkaran);
	}
}

/**
* PERTANYAAN:
* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
*
* JAWABAN:
* Secara konsep, tidak ada yang kurang tepat pada program Asersi2 di atas. Semuanya sudah tepat.
* Pada line 27 terdapat asersi yang berfungsi untuk menolak masukan jari-jari lingkaran
* jika jari-jari tersebut bernilai 0 atau lebih kecil dari 0.
* Jika asersi diaktifkan dan input jari-jari lingkaran bernilai 0 atau negatif,
* maka akan terjadi error pada saat kompilasi dan menampilkan pesan "jari jari tidak boleh nol!!!".
*/