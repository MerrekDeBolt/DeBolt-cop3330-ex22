package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 21 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        int num1, num2, num3, largest;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        num3 = scanner.nextInt();

        largest = num1;
        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;

        System.out.println("The largest number is " + largest + ".");
    }
}