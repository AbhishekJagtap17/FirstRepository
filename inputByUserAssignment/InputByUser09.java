package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        System.out.println((a<50)&&(a<b));
    }
}
