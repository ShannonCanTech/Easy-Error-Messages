package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number that is less than 10: ");
        number = scan.nextInt();
        scan.nextLine();

//        Give the user 3 attempts to enter a number less than 10
        for(int errorMessage = 0; errorMessage < 3; errorMessage++) {
//            If the number is greater than 10, output "That number is too large"
            if (number > 10) {
                System.out.println("That number is too large" + "\n" + "Enter a new number:");
                number = scan.nextInt();
                scan.nextLine();
            }
        }

//        If number is still greater than 10, print "Number entered too big" and exit program
        if(number > 10){
            System.out.println("Number entered is too big.");
        }

        if(number <= 10){
            System.out.println(number + " is just right!");
        }

    }
}
