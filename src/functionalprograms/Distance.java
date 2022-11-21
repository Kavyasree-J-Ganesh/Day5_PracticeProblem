package functionalprograms;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the Valur of x ");
        int x = scan.nextInt();

        System.out.println(" Enter the Valur of y ");
        int y = scan.nextInt();

        double distance = Math.sqrt( x*x + y*y);
        System.out.println(distance);
    }
}
