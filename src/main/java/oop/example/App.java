package oop.example;


public class App {
    public static void main(String[] args) {
        Input userNumbers = new Input();
        double[] twoNumbers = userNumbers.getInput();
        DoMath userMath = new DoMath();
        double addAnswer = userMath.add(twoNumbers[0], twoNumbers[1]);
        double subAnswer = userMath.subtract(twoNumbers[0], twoNumbers[1]);
        double multiAnswer = userMath.multiply(twoNumbers[0], twoNumbers[1]);
        double divAnswer = userMath.divide(twoNumbers[0], twoNumbers[1]);

        System.out.printf("What is the first number? %.0f%n" +
                        "What is the second number? %.0f%n"
                        + "%.0f + %.0f = %.0f%n"
                        + "%.0f - %.0f = %.0f%n"
                        + "%.0f * %.0f = %.0f%n"
                        + "%.0f / %.0f = %.0f%n"
                        +"Note: Numbers are rounded to the nearest integer.%n"
                , twoNumbers[0], twoNumbers[1],
                twoNumbers[0], twoNumbers[1], addAnswer,
                twoNumbers[0], twoNumbers[1], subAnswer,
                twoNumbers[0], twoNumbers[1], multiAnswer,
                twoNumbers[0], twoNumbers[1], divAnswer
        );


    }
}
