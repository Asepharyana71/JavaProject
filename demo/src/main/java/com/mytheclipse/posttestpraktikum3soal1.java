package com.mytheclipse;

class Segitiga {
    // Atribut
    double alas;
    double tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(5, 7);

        // Menghitung dan menampilkan luas segitiga
        double luas = segitiga.hitungLuas();
        System.out.println("Luas segitiga: " + luas);

        // Menghitung dan menampilkan keliling segitiga
        double keliling = segitiga.hitungKeliling();
        System.out.println("Keliling segitiga: " + keliling);
    }
}
