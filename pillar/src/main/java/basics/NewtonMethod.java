package basics;

import java.util.Scanner;

public class NewtonMethod {
    private static final double EPSILON = 1e-15;
    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextInt();
        scanner.close();
        double t = c;
        while (Math.abs(t - c/t) > EPSILON * t){ 
            // Replace t by the average of t and c/t.
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
    
}
