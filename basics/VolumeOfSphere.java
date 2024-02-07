package basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Sphere: ");
        int r = sc.nextInt();
        System.out.println("Volume of sphere is: ");
        double area = (4 * 3.14 * r*r*r)/3;
        System.out.println(area);



    }
}
