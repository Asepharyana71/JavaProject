package com.modul4pbo;

public class teman {
    public String nama;
    public int pacar=0,mantan=0;
    public teman(String nm){
        nama = nm;
    }
    public teman(String nm,int pac){
        nama = nm;
        pacar = pac;
    }
    public teman(String nm,int pac,int mant){
        nama = nm;
        pacar = pac;
        mantan = mant;
    }
    public void cetak(){
        System.out.println("Nama: "+nama);
        System.out.println("Jumlah Pacar: "+pacar);
        System.out.println("Jumlah Mantan: "+mantan);
    }
}
