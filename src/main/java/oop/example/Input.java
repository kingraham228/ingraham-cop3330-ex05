package oop.example;
import java.util.Scanner;
public class Input {

    public double[] getInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        double num1 = input.nextDouble();

        System.out.println("What is the second number? ");
        double num2 = input.nextDouble();

        return new double[]{num1, num2};
    }




}
