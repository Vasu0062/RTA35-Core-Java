package com.learning.core.controlstatements.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the result
        long factorial = 1;

        // Using a for loop to calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by the current number
        }

        // Display the result
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
//If we give input as 4 the factorial value is 4*3*2*1=24
