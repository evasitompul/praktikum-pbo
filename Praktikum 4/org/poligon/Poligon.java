/**
* Nama			: Eva Sitompul
* NIM			: 24060119120035
* Lab			: B2
* Nama File		: Poligon.java
* Tanggal Pembuatan	: 08/03/2023
* Deskripsi		: Representasi dasar dari objek poligon (segi banyak) 
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public void Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int jumlahSisi){
		this.jumlahSisi = jumlahSisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}