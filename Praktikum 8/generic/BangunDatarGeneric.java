/**
* Nama				: Eva Sitompul
* NIM				: 24060119120035
* Lab				: B2
* Nama File			: BangunDatarGeneric.java
* Tanggal Pembuatan	: 17/05/2023
* Deskripsi			: kelas kontruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T2 extends BangunDatar> {
    private T2 bangunDatar;

    public void set(T2 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T2 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*
Soal:
Gantilah ‘T’ (dan segala T) diganti dengan karakter yang lain seperti, T1,T2,T1234.
Simpulkan apa yang anda lakukan!

Jawaban:
Tidak ada error dan masalah pada source code ketika di compile saat T diganti menjadi T2
Pergantian T menjadi T2 bertujuan untuk memberikan nama yang lebih deskriptif terhadap parameter generik
Hal tersebut dilakukan untuk memberikan fleksibilitas dalam penggunaan data
serta untuk membedakan jika ada lebih dari satu parameter generik dalam kelas tersebut.
*/