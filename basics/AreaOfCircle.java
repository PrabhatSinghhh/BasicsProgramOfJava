package basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the radius of circle:  ");
        double r = sc.nextDouble();
        System.out.println();
        System.out.print(" Area of circle is : ");
        double area = 3.14*r*r;
        System.out.println(area);

    }
}
