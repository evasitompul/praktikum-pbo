/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: AngkaSial.java
* Tanggal Pembuatan	: 29/03/2023
* Deskripsi			: Program penggunaan exception buatan sendiri
					Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial"); //jika eksepsi terjadi, maka line ini tidak dieksekusi
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){ //jika eksepsi terjadi, maka line akan dieksekusi
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/**
* PERTANYAAN:
* 1. Ketika eksepsi terjadi, apakah baris 17 pada AngkaSial.java di atas dieksekusi? 
* 2. Apakah baris 26 pada AngkaSial.java di atas dieksekusi?
* 
* PEMBAHASAN:
* 1. Tidak, baris 17 pada AngkaSial.java di atas tidak dieksekusi,
*    karena pada baris 15 terdapat throw new AngkaSialException();
*    artinya jika ada kesalahan maka akan menampilkan pesan kesalahan
*    yang telah ditentukan pada kelas AngkaSialException.java
* 2. Iya, baris 26 pada AngkaSial.java di atas dieksekusi,
*    karena pada baris 26 terdapat try catch dengan fungsi menangkap kesalahan yang terjadi pada baris 15. 
*    Throw berfungsi untuk melempar sebuah exception, sehingga saat throw terjadi
*    blok catch akan menangkap exception tersebut dan menampilkkan pesan kesalahan
*    yang telah ditentukan pada kelas AngkaSialException.java.	
*/




