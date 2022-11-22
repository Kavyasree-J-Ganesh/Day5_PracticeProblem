package functionalprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter the temperature");

        double t = scan.nextDouble();

        System.out.println("Enter the wind speed");

        double v = scan.nextDouble();

        double windChill = 35.74 + .6215*t + (.4275*t-35.75)*Math.pow(v,.16);

        System.out.println("Wind Chill is "+ windChill);
    }
}
