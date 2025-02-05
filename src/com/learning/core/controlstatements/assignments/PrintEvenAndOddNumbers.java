package com.learning.core.controlstatements.assignments;
public class PrintEvenAndOddNumbers{
    public static void main(String[] args) {
        //PrintEvenAndOddNumbers.evenCal();
        evenCal();
        oddCal();
    }


public static void evenCal() {
    System.out.println("Even Numbers");
    for (int i = 2; i <= 20; i += 2) {
        System.out.print(i+" ");
    }
    System.out.println();
}
    public static void oddCal() {
        System.out.println("Odd Numbers");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i+" ");
        }
    }
}
