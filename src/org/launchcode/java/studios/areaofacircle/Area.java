package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {  // this is the class
    public static void main(String[] args) {   // this is the function inside th class
        double radius;
        double pie;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        double area = Circle.getArea(5.55);
        System.out.println("The area of the circle is: " + area);
    }
}