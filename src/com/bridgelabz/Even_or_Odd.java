package com.bridgelabz;

public class Even_or_Odd {
    static void evenOrOdd(int num){
        if(num % 2 ==0){
            System.out.println(" Number is Even ");
        }else
            System.out.println(" Number is Odd ");
    }

    public static void main(String[] args) {
        int number = (6);
        evenOrOdd(number);
    }
}
