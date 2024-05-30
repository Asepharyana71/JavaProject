package com.mytheclipse;

/**
 * biodata
 */
interface biodata {
    String nama = "Siti Maesyaroh";
    public void kerja();
    
}
interface NegaraDosen {
    String negara = "Indonesia";
    public void alamat();
}



class dosen implements biodata, NegaraDosen{
    public void kerja() {
        System.out.println(nama+" sebagai dosen yang mengajar matakuliah PBO");
    }
    public void alamat() {
        System.out.println(negara+" adalah negara tempat tinggalnya");
    }
    public static void main(String[] args) {
        dosen dsl = new dosen();
        dsl.kerja();
        dsl.alamat();
        
    }
}
