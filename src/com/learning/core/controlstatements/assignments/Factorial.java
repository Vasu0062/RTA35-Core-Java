package com.learning.core.controlstatements.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by the current number
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
//If we give input as 4 the factorial value is 4*3*2*1=24
