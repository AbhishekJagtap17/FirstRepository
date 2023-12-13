package inputByUserAssignment;

import java.util.Scanner;

public class InputByUser10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1st sub marks");
        float a=s.nextInt();
        System.out.println("2nd sub marks");
        float b=s.nextInt();
        System.out.println("3rd sub marks");
        float c=s.nextInt();

        float totalMarks=(a+b+c);
        float percentage= ((totalMarks/300.00f)*100);
        System.out.println ( "Total marks :"+totalMarks);
        System.out.println("Percentage :"+percentage);
    }
}
