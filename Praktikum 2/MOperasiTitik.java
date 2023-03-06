/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: MOperasiTitik.java
* Tanggal Pembuatan	: 01/03/2023
* Deskripsi			: Kelas yang berisi program utama yang memanfaatkan OperasiTitik 
*/

class MOperasiTitik{
	public static void main(String[]args){
		Titik t1 = new Titik(4.0,4.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("\nTitik:("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		Titik t2 = op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi sumbu X:\n");
		System.out.println("Titik("+t2.getAbsis()+","+t2.getOrdinat()+")");
		
		Titik t3 = op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y:\n");
		System.out.println("Titik("+t3.getAbsis()+","+t3.getOrdinat()+")");
		
	}
}