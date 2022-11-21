package com.basiccoreprograms;

public class PrimeFactors {
    static boolean checkPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){  // similar to i*i <= N
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static void getPrimeFactors(int num){
        System.out.println("Prime factors are");
        for(int i=1; i<num/2; i++){
            if(num % i==0 && checkPrime((i))){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        getPrimeFactors(21);
    }
}
