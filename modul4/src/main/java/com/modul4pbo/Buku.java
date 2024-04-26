package com.modul4pbo;

public class Buku {
    String judul, pengarang;

    Buku() {
        this.pengarang = "Benny Hermawan";
        this.judul = "Menguasai Java 2 dan OOP";
    }

    Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void cetakKelayar() {
        if (judul == null && pengarang == null) {
            return;
        }
        System.out.println("Judul: " + judul + "Pengarang: " + pengarang);
    }
}
