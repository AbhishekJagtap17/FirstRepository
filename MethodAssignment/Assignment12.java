package MethodAssignment;

import java.util.Scanner;

public class Assignment12 {
    void fibonacciSeries(int n){
        int firstTerm=0;
        int secondTerm=1;
        for(int i=1;i<=n/2;i++){
            firstTerm=firstTerm+secondTerm;
            secondTerm=firstTerm+secondTerm;

        }
        System.out.println(secondTerm);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. of term u want : ");
        int n=scanner.nextInt();
        Assignment12 a12=new Assignment12();
        a12.fibonacciSeries(n);
    }
}
