package com.company1.Day16And17.AlgorithmPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string = "State";
        String string2= "Taste";
        char[] array1=string.toLowerCase().toCharArray();
        char[] array2=string2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1, array2)) {
            System.out.println("string are anagrams");
        }else {
            System.out.println("string are not anagram");
        }
    }
}
