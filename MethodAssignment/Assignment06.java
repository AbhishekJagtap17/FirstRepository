package MethodAssignment;

import java.util.Scanner;

public class Assignment06 {
    float circumferenceOfcircle(int r){
        return (2*3.142f*r);
    }
    float areaOfCircle(int r){
        return(3.142f*r*r);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        int r= scanner.nextInt();
        Assignment06 a06=new Assignment06();
        System.out.println("Circumference of circle is : "+a06.circumferenceOfcircle(r));
        System.out.println("Area of circle is : "+a06.areaOfCircle(r));
    }
}
