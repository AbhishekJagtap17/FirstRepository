package MethodAssignment;

import java.util.Scanner;

public class Assignment07 {
   static String primeOrNot(int number){
       int count=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
            return count==2?"Prime":"Not Prime";
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number= scanner.nextInt();

        System.out.println(number +" is "+Assignment07.primeOrNot(number)+" number");
    }
    }

