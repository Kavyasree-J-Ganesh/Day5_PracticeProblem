package functionalprograms;

public class Quadratic {
    static void quadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta >= 0) {
            double Root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double Root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(Root1);
            System.out.println(Root2);
        } else {
            System.out.println(" Roots are Imaginary ");
        }
    }
        public static void main(String[] args){
            quadraticEquation(2, 3, 4);
        }
    }
