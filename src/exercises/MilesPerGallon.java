package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the amount of miles you traveled: ");
        miles = input.nextDouble();
        System.out.println("Enter the amount of gas: ");
        gas = input.nextDouble();
        input.close();

        double mpg = (miles / gas);
        System.out.println("The miles per gallon is: " + mpg);
    }
}