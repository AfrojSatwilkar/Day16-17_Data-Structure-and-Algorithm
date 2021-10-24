package com.company1.Day16And17.AlgorithmPrograms;

import java.util.Scanner;

public class ExtendPrimeNumberPalindrome {
    public static void main(String args[]) {
        int startRange, endRange;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        startRange = sc.nextInt();
        System.out.println("Enter last value");
        endRange = sc.nextInt();

        System.out.println("The Palindrome Prime Numbers between " + startRange + " and " + endRange + " are :");
        for(int i = startRange; i <= endRange; i++){
            if(checkPalPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPalPrimeNumber( int number){

        int temp, rem, i;
        int count = 0;
        int sum = 0;
        temp = number;

        //check whether number is prime or not
        for(i = 1; i <= temp; i++) {
            if(temp%i == 0) {
                count++;
            }
        }

        //check whether the number is palindrome or not
        while(number > 0) {
            rem = number%10;
            sum = sum*10+rem;
            number = number/10;
        }

        //check whether the number is palindrome and Prime or not
        if(temp == sum && count == 2) {
            return true;
        }
        else {
            return false;
        }
    }
}

