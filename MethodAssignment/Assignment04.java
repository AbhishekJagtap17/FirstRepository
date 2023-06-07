package MethodAssignment;

import java.util.Scanner;

public class Assignment04 {
    static int  sum(int number1,int number2){
        return number1+number2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number :");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();

        System.out.println("Sum of two number is : "+Assignment04.sum(number1,number2));
    }
}
