package com.modul4pbo;

public class overload {
    public static void main(String[] args) {
        teman baru = new teman("wildan");
        System.out.println("pada konstruktor pertama =");
        baru.cetak();
        teman lama = new teman("syandu",100);
        System.out.println("pada konstruktor kedua =");
        lama.cetak();
        teman cantik = new teman("tania",100,1);
        System.out.println("pada konstruktor ketiga =");
        cantik.cetak();
    }

}
