package ru.vsu.cs.kalashyan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double gip = writeRadius();
        double radius = calculateRadius(gip);
        double s = calculateArea(radius);
        printArea(calculateArea(radius));

    }

    public static double writeRadius() {
        Scanner exe = new Scanner(System.in);
        System.out.print("Enter hypotenuse: ");
        return exe.nextDouble();
    }

    public static double calculateCatet(double gip) {
        return gip / Math.sqrt(2);
    }

    static double calculateRadius(double gip) {
        return (calculateCatet(gip) * 2 - gip) / 2;
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static void printArea(double calculateArea) {
        System.out.printf(" The area of circle to %f!%n ", calculateArea);

    }
}