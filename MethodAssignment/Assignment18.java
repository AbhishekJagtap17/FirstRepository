package MethodAssignment;

import java.util.Scanner;

public class Assignment18 {
    static int area(int length,int breadth){

        return (length*breadth);
    }
    static int area(int side){
        return(side*side);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("Area of rectangle : "+Assignment18.area(l,b));
        int s= scanner.nextInt();
        System.out.println("Area of Square : "+Assignment18.area(s));
    }
}
