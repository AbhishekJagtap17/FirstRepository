package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First Number:");
        int a=sc.nextInt();
        System.out.println("Second Number");
        int b=sc.nextInt();
        System.out.println("Third Number");
        int c=sc.nextInt();

        boolean d=(a==b)&&(a==c);
       boolean e=(a==b)||(a==c)||(b==c);

        System.out.println("All are equals  :"+d);
        System.out.println("Two are equals :"+e);


    }
}
