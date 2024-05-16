package com.mytheclipse;

public class bentuk {
    public String getDataLuas(){
        return "Data Luas Berbagau bentuk bangun datar :r";
    }
    
    
    public static void main(String[] args) {
        bentuk b = new bentuk();
        persegi p = b.new persegi(4);
        segitiga s = b.new segitiga(3, 4);
        lingkaran l = b.new lingkaran(5);
        System.out.println("Luas Persegi : " + p.luas());
        System.out.println("Luas Segitiga : " + s.luas());
        System.out.println("Luas Lingkaran : " + l.luas());
        
    }
    
    class persegi extends bentuk {
        public int sisi;
        public persegi(int s){
            this.sisi = s;
        }
        public int luas(){
            return sisi * sisi;
        }
    }
    class segitiga extends bentuk {
        public int alas;
        public int tinggi;
        public segitiga(int a, int t){
            this.alas = a;
            this.tinggi = t;
        }
        public int luas(){
            return (alas * tinggi) / 2;
        }
    }
    class lingkaran extends bentuk {
        public int jari;
        public lingkaran(int j){
            this.jari = j;
        }
        public double luas(){
            return 3.14 * jari * jari;
        }
    }
}
