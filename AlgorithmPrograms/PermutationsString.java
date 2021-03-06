package com.company1.Day16And17.AlgorithmPrograms;

import java.util.Scanner;

public class PermutationsString {
    public static void main(String[] args) {
        System.out.print("Enter first number : ");
        Scanner scanInput = new Scanner(System.in);
        String str = scanInput.next();

        int n = str.length();
        PermutationsString permutation = new PermutationsString();
        permutation.permute(str, 0, n - 1);
    }

    public static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
