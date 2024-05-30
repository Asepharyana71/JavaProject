package com.mytheclipse;

/**
 * biodata
 */
interface biodata {
    String nama = "siti maesyaroh";
    public void kerja();
    
}

class dosen implements biodata {
    public void kerja() {
        System.out.println(nama+" sebagai dosen yang mengajar matakuliah PBO");
    }
    public static void main(String[] args) {
        dosen dsl = new dosen();
        dsl.kerja();
    }
}
