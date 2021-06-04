package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Input {


    public double[] getInput() {
        Scanner input = new Scanner(System.in);

        double num1;

        do {

            System.out.println("What is the first number? ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid positive number.");
            }
            num1 = input.nextDouble();
        } while (num1 < 0);


        double num2;

        do {
            System.out.println("What is the second number? ");
            while (!input.hasNextDouble()) {
                String str2 = input.next();
                System.out.println(str2 + " is not a valid positive number.");
            }
            num2 = input.nextDouble();

        } while (num2 < 0);

        return new double[]{num1, num2};
    }


}
