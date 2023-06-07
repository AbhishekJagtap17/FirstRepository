package MethodAssignment;

import java.util.Scanner;

public class Assignment14 {
    int res=1;
   void power(int a,int b) {
        for (int index = 1; index <= b; index++) {
          res=res*a;
        }
       System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a= scanner.nextInt();
        System.out.println("Enter the Power : ");
        int b= scanner.nextInt();
        Assignment14 a14=new Assignment14();
        a14.power(a,b);
    }
}
