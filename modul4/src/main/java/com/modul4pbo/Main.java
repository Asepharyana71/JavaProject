package com.modul4pbo;

class tugas {

    // Atribut
    private double panjang;
    private double lebar;

    // Constructor tanpa parameter
    public tugas() {
        panjang = 0;
        lebar = 0;
    }

    // Constructor dengan satu parameter (sisi)
    public tugas(double sisi) {
        panjang = sisi;
        lebar = sisi;
    }

    // Constructor dengan dua parameter (panjang dan lebar)
    public tugas(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Hitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Hitung keliling persegi panjang
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Tampilkan informasi persegi panjang
    public void tampilInformasi() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

public class Main {

    public static void main(String[] args) {
        // Buat objek persegi panjang tanpa parameter
        tugas tugas1 = new tugas();

        // Buat objek persegi panjang dengan satu parameter (sisi)
        tugas tugas2 = new tugas(5);

        // Buat objek persegi panjang dengan dua parameter (panjang dan lebar)
        tugas tugas3 = new tugas(10, 7);

        // Tampilkan informasi persegi panjang 1
        System.out.println("Persegi Panjang 1:");
        tugas1.tampilInformasi();

        // Tampilkan informasi persegi panjang 2
        System.out.println("\nPersegi Panjang 2:");
        tugas2.tampilInformasi();

        // Tampilkan informasi persegi panjang 3
        System.out.println("\nPersegi Panjang 3:");
        tugas3.tampilInformasi();
    }
}

