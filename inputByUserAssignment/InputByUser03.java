package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length and Bredth of Rectangle:");
        double l=s.nextDouble();
        double b=s.nextDouble();
        int area=(int)(l*b);

        System.out.println("Area of Rectangle is"+area);
    }
}
