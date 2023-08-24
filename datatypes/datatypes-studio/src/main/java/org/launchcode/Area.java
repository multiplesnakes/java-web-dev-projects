package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius 2.5 is: " + area);
    }
}