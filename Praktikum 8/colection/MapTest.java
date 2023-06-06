/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: MapTest.java
* Tanggal Pembuatan	: 17/05/2023
* Deskripsi			: program yang menggunakan Generic untuk pasangan kunci-Nilai
*/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci-> integer, nilai-> string
		//kenapa Map disebelah kiri dan HashMap di sebelah kanan
		//karena Map itu interface dan HashMap itu merupakan kelas interfacenya
		Map<Integer,String> map = new HashMap<Integer,String>();
				
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");

		//mengambil elemen pertama
		System.out.println(map.get(1));
		
		//mengambil keseluruhan kunci sebagai objek collection Set
		Set<Integer> key = map.keySet();
		
		//Soal:
		//Bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
		//petunjuk: gunakan iterasi seperti program ArrayListTest
		//Jawaban:
		for(Integer i: key){
			String value = map.get(i);
			System.out.println(value);
		}
	}
}