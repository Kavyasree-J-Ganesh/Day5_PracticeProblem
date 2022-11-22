package functionalprograms;

import java.util.Scanner;

public class Array2D {
    static void print(int[][] arr){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Elements of the array");

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Elements of the array are");
        print(arr);
    }
}
