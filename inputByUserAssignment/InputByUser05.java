package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side of Square :");
        int side=s.nextInt();
        int area=(side*side);
        int perimeter=(4*side);
        System.out.println("Area of square: "+area);
        System.out.println("Perimeter of Square: "+perimeter);
    }
}
