package com.mytheclipse;

abstract class Pengajar {
    String nama;
    public abstract void caramakan();
    public void kerja() {
        System.out.println(this.nama+ " sebagai dosen yang mengajar matakuliah PBO ");
    }
    public static void main(String[] args) {
        dosn objek1 = new dosn("siti maesyaroh");
        objek1.kerja();
        objek1.caramakan();
    }
    
}
class dosn extends Pengajar {
    public dosn(String nama) {
        this.nama = nama;
    }
    public void caramakan() {
        System.out.println("jika makan mengguankan sendok");
    }
}