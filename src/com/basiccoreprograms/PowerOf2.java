package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int N = Integer.valueOf(args[0]);
        int mul = 1;
        for(int i=0; i<=N; i++) {
            mul = mul * 2;
            System.out.println(mul);
        }
    }
}

