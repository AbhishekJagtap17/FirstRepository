package MethodAssignment;

import java.util.Scanner;

public class Assignment17 {
   static void method(int n,char c){
       System.out.println(n +" \t"+c);
    }
   static void method (char c,int n){
        System.out.println(c +" \t"+n);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment17.method(10,'A');
        Assignment17.method('B',11);
    }
}
