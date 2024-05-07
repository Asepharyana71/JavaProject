package com.modul4pbo;

public class constructor {
    String brand;
    String color;
    int year;

    public constructor(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void printInfo() {
        System.out.printf("Brand: %s, Color: %s, Year: %d%n", this.brand, this.color, this.year);
    }

    public static void main(String[] args) {
        constructor car = new constructor("Toyota", "Red", 2022);
        car.printInfo();
    }
}
