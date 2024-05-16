package com.mytheclipse;
public class 5Mei {
    public class mahasiswa {
        public String nama;
        public String nim;
        public String jurusan;
        public mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }
        public String biodata() {
            return "Nama: " + this.nama + "\nNIM: " + this.nim + "\nJurusan: " + this.jurusan;
        }
    
        
    }
    public static void main(String[] args) {
        
    }
}
