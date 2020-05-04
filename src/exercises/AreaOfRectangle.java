package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double length;
        double width;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = input.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        width = input.nextDouble();
        input.close();

        double area=length*width;
        System.out.println("The area of Rectangle is: " + area);
    }
}

