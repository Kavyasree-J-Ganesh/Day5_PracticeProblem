package com.basiccoreprograms;

public class Swap_2_Numbers {
    static void swapNumbers(int a, int b){

        System.out.println(" Value of a is " + a);
        System.out.println(" Value of b is " + b);

       int swap = a;
       a = b;
       b = swap;

        System.out.println(" Value of a after swap is " + a);
        System.out.println(" Value of b after swap is " + b);
    }

    public static void main(String[] args) {
        swapNumbers(2,5);
    }
}
