package com.bridgelabz;

public class Quotient_Remainder {
    static void quotientAndRemainder(int a, int b){
        int x = a / b;
        int y = a % b;
        System.out.println(" Quotient is " + x);
        System.out.println(" Remainder is " + y);
    }
    public static void main(String[] args) {
        quotientAndRemainder(45, 9);
    }
}
