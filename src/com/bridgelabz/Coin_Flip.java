package com.bridgelabz;

public class Coin_Flip {
    static void flipCoin(double num){
        double random = Math.random();

        double tail = 0;
        double head = 0;

        for (int i=1 ; i<=num; i++){
            double flip =  Math.random();

            if (flip < 0.5){
                tail++;
            }else {
                head++;
            }
        }

        double headPercentage = (head/num) * 100;
        double tailPercentage = (tail/num) * 100;

        System.out.println( " Tail " + tailPercentage );
        System.out.println( " Head " + headPercentage );
    }
    public static void main(String[] args) {
        flipCoin(4);
    }
}
