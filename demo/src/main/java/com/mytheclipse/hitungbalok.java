package com.mytheclipse;

public class hitungbalok {
    public static void main(String[] args) {
        int p, l, t, volume, luas, keliling;
        p = 5;
        l = 3;
        t = 6;

        volume = p * l * t;
        luas = 2 * ((p * l) + (p * t) + (l * t));
        keliling = 4 * (p + l + t);

        System.out.println("Volume Balok: " + volume);
        System.out.println("Luas Balok: " + luas);
        System.out.println("Keliling Balok: " + keliling);
    }
}
