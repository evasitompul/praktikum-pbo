/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: LambdaHashmap.java
* Tanggal Pembuatan	: 01/06/2023
* Deskripsi			: Ekspresi lambda pada Hashmap, digunakan sebagai parameter pada method.
*/

import java.util.*;

public class LambdaHashMap{
	public static void main(String[] args){
		//membuat HashMap
		Map<String, String> mahasiswaMap = new HashMap<>();
		
		//memasukkan nilai
		mahasiswaMap.put("24060119120035", "Eva Sitompul");
		mahasiswaMap.put("24060119130105", "Steven William");
		mahasiswaMap.put("24060119140113", "Jacob Lee");
		mahasiswaMap.put("24060119120018", "Anna Adams");
		
		mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
	}
}