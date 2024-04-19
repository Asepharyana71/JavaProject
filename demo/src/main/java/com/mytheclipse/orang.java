package com.mytheclipse;

public class orang
{
    public void caraMakan(){
        System.out.println("Sebagian orang jika makan menggunakan tangan");
    }
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.asalKampus();
        mhs1.caraMakan();
    
    }
}
class mahasiswa extends orang{
    public void asalKampus(){
        System.out.println("TERDAPAT MAHASISWA YANG BERASAL DARI UNIKU");
        System.out.print("Namun ");
        super.caraMakan();
    }
    public void caraMakan(){
        System.out.println("Mahasiswa makan menggunakan sendok");
    }

}