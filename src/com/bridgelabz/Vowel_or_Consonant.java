package com.bridgelabz;

public class Vowel_or_Consonant {
    static void checkVowelOrConsonant(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u'){
            System.out.println( ch + " is Vowel ");
        }else{
            System.out.println( ch + " is Consonant ");
        }
    }
    public static void main(String[] args) {

        checkVowelOrConsonant('r');
    }
}
