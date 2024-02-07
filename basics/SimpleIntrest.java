package basics;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: " );
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest ");
        double r = sc.nextDouble();
        System.out.println("Enter the time ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;
        System.out.println(si);


    }

}
