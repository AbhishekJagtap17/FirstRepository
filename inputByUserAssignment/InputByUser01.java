package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();

        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        int sum=a+b;
        int prod=a*b;

        System.out.println("Sum of User enterd value is :"+sum);
        System.out.println("Product of User enterd value is :"+prod);

        int resSum=sum+prod;
        int resProd=sum*prod;

        System.out.println("Sum of Resultant value:"+resSum);
        System.out.println("Prod of Resultant value:"+resProd);

    }
}
