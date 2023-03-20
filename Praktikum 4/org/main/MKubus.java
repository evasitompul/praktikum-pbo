/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: MKubus.java
* Tanggal Pembuatan	: 15/03/2023
* Deskripsi		: driver class untuk Kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas alas kubus dengan panjang sisi 4 satuan: "+kubus.hitungLuasAlas());
		System.out.println("Volume kubus dengan panjang sisi 4 satuan: "+kubus.hitungVolume());
	}
}