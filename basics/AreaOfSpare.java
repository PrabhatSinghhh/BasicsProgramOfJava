package basics;

import java.util.Scanner;

public class AreaOfSpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Radius of spare : ");
        int r = sc.nextInt();
        System.out.println(" The Area of spare is: ");
        double area = 4 * 3.14 * r * r;
        System.out.println(area);

    }
}
