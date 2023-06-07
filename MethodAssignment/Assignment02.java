package MethodAssignment;

import java.util.Scanner;

public class Assignment02 {
    String evenOrOdd(int a) {
        if (a % 2 == 0) {
            return "Even Number";
        } else {
            return "odd Number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a= scanner.nextInt();
        Assignment02 a2=new Assignment02();
        System.out.println(a+" is a "+a2.evenOrOdd(a));
    }
}
