package com.modul4pbo;

public class constructor {
    String data, data2;
    
    public constructor(String data, String data2) {
        this.data = data;
        this.data2 = data2;
    }
    
    void cetakConst() {
        System.out.printf("%s %s", this.data, this.data2);
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        constructor a = new constructor("rio", "fkom");
        a.cetakConst();
    }
}
