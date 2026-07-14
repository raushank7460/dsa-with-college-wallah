package Conditional;

import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char ops = sc.next().charAt(0);
        switch (ops) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}