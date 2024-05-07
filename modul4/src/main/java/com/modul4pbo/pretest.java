package com.modul4pbo;


public class pretest {
    private String data1;
    private int data2;
    private double data3;

    public pretest(String data1, int data2, double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }


    public static void main(String[] args) {
        // Create an instance of Pretest using the constructor
        pretest pretest = new pretest("Hello", 123, 3.14);

        // Use the initialized data
        System.out.println("Data 1: " + pretest.data1);
        System.out.println("Data 2: " + pretest.data2);
        System.out.println("Data 3: " + pretest.data3);
    }
}