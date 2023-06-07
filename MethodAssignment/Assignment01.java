package MethodAssignment;

import java.util.Scanner;

public class Assignment01 {
    int max(int number1,int number2,int number3) {
        return  number1>=number2&&number1>=number3?number1:number2>=number1&&number2>=number3?number2:number3;
    }
    int min(int number1,int number2,int number3) {
        return number1<=number2&&number1<=number3?number1:number2<=number1&&number2<=number3?number2:number3;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three number : ");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();

        Assignment01 assignment01=new Assignment01();
        System.out.println("Maximun number : "+assignment01.max(number1,number2,number3));
        System.out.println("Minimun number : "+assignment01.min(number1,number2,number3));
    }
}
