package MethodAssignment;

import java.util.Scanner;

public class Assignment05 {
    int product(int number1,int number2){
        return number1*number2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two number :");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        Assignment05 a05=new Assignment05();
        System.out.println("Product of two number is :"+a05.product(number1,number2));
    }
}
