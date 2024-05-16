package com.mytheclipse;

public class bentuk {
    public static int luas(int p, int l) {
        return p * l;
    }
    public static float luas(int alas , float t){
        return (alas * t) / 2;
    }
    public static double luas (double phi, int jari){
        return (phi*jari)*2;
    }
    public static void main(String[] args) {
        bentuk lingkaran = new bentuk();
        System.out.println("Data Luas Berbagau bentuk bangun datar :");
        System.out.println("Luas Persegi : " + bentuk.luas(3, 4));
        System.out.println("Luas Segitiga : " + bentuk.luas(2, 4));
        System.out.println("Luas Lingkaran : " + bentuk.luas(3.14, 5  ));
    }
}
