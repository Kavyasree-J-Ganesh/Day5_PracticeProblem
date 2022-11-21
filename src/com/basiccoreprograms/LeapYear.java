package com.basiccoreprograms;

public class LeapYear {
    static void checkLeapYear(int year) {

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println( year + " is Leap Year ");
        }else {
            System.out.println( year + " is Not a Leap Year ");
        }
}
    public static void main(String[] args) {
        checkLeapYear(2000);
    }
}
