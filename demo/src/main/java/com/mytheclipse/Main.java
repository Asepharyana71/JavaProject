package com.mytheclipse;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nama1 = JOptionPane.showInputDialog("Masukkan nama mahasiswa 1:");
        int umur1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur mahasiswa 1:"));

        String nama2 = JOptionPane.showInputDialog("Masukkan nama mahasiswa 2:");
        int umur2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur mahasiswa 2:"));

        Mahasiswa mahasiswa1 = new Mahasiswa(nama1, umur1);
        Mahasiswa mahasiswa2 = new Mahasiswa(nama2, umur2);

        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();
    }
}
