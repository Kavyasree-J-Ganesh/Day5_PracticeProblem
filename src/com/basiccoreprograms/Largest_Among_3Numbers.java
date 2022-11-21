package com.basiccoreprograms;

public class Largest_Among_3Numbers {
    static void largest(int num1, int num2, int num3){
        if(num1 > num2){
            if(num1 > num3){
                System.out.println( num1 + " is Largest ");
            }else{
                System.out.println( num2 + " is Largest ");
            }

        }else{
            if(num3 > num2){
                System.out.println( num3 + " is Largest ");
            }else{
                System.out.println( num2 + " is Largest ");
            }
        }
    }
    public static void main(String[] args) {
        largest(45, 32, 17);
    }}
