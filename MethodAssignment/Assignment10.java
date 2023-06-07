package MethodAssignment;


import java.util.Scanner;
public class Assignment10 {
     static void table(int n){
         for(int i=1;i<=10;i++){
             System.out.println(i*n);;
            }
         }
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scanner.nextInt();
        Assignment10.table(n);
    }
}
