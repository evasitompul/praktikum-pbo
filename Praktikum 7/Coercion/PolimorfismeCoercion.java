/**
* Nama				      : Eva Sitompul
* NIM				        : 24060119120035
* Lab				        : B2
* Nama File			    : PolimorfismeCoercion.java
* Tanggal Pembuatan	: 03/05/2023
* Deskripsi			    : Kelas yang berisi program untuk kelas PolimorfismeCoercion.
*/

public class PolimorfismeCoercion{
	
	public static int kuadrat(int bilangan){ //int masuk ke dalam tipe data yang primitif
		return bilangan*bilangan;
	}
	
	public static void main(String[] args){
		//deklarasi objek integer
		Integer bilangan = 10; //Integer di sini merupakan sebuah kelas/instans
		
		//objek integer 'dipaksa' untuk diubah menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
	}
}
