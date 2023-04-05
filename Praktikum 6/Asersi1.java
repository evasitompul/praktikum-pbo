/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: Asersi1.java
* Tanggal Pembuatan	: 29/03/2023
* Deskripsi			: Program untuk menunjukkan asersi
*/

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x > 0){
			System.out.println("x bilangan positif");
		}
		else{
			assert(x < 0): "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}