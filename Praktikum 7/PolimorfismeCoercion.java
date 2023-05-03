/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: PolimorfismeCoercion.java
* Tanggal Pembuatan	: 03/05/2023
* Deskripsi		: Kelas yang berisi program untuk kelas PolimorfismeCoercion.
*/

public class PolimorfismeCoercion{
	
	public static int kuadrat(int bilangan){
		return bilangan*bilangan;
	}
	
	public static void main(String[] args){
		//deklarasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
	}
}
