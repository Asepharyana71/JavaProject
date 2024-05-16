package com.mytheclipse;

public class mahluk_hidup {
    public String nama;
    protected mahluk_hidup(String nm) {
        this.nama = nm;
    }
    public String biodata() {
        return "Nama: " + this.nama;
    }
    public static void main(String[] args) {
        pelajar siswa = new pelajar("daffa",2023081, "SMAN 3 Kuningan");
        System.out.println(siswa.biodata());
    }
}

class pelajar extends mahluk_hidup {
    public int nis;
    private String asalSekolah;
    public pelajar(String nm, int ns, String sekolah) {
        super(nm);
        this.nis = ns;
        this.asalSekolah = sekolah;
    }
    public String biodata() {
        return super.biodata() + "\nNIS: " + nis + "\nasalSekolah: " + asalSekolah;
    }
}
