package com.mytheclipse;

public class pewarisan {
    public void Kendaraan() {
        System.out.println("Saya punya sebuah Kendaraan");
    }

    public void jenisKendaraan() {
        System.out.println("Kendaraan adalah alat transportasi");
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.Kendaraan();
        mobil.jenisKendaraan();
    }
}

class Mobil extends pewarisan {
    public Mobil() {
        super.jenisKendaraan();
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Kendaraan yang saya punya adalah Mobil");
    }
}
