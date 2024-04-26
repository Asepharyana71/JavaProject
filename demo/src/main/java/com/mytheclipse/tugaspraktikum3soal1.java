package com.mytheclipse;

import javax.swing.JOptionPane;

public class tugaspraktikum3soal1 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari tabung:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi tabung:"));

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Volume tabung: " + volume);
        System.out.println("Luas permukaan tabung: " + surfaceArea);
    }
}
