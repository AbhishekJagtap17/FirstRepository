package MethodAssignment;

import java.util.Scanner;

public class Assignment09 {
    static int fact(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= scanner.nextInt();
        System.out.println("Factorial is : "+Assignment09.fact(number));
    }
}
