package com.mytheclipse;

import javax.swing.JOptionPane;

public class posttestpraktikum3soal2
{
    public static void main( String[] args )
    {
       double volume;
       Balok bl = new Balok();
       bl.panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Balok"));  
       bl.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Balok"));
       bl.tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Balok"));
       volume = bl.panjang * bl.lebar * bl.tinggi;
       System.out.println("Volume Balok = " + volume);

    }
}

class Balok {
    int panjang;
    int lebar;
    int tinggi;
}