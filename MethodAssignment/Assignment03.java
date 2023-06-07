package MethodAssignment;

import java.util.Scanner;

public class Assignment03 {
   static String elligibleOrNot(int age){
        return age>=18?"Yes":"Not eligible";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age= scanner.nextInt();

        System.out.println("Person is elligible to vote :"+Assignment03.elligibleOrNot(age));
    }
}
