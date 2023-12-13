package inputByUserAssignment;

import java.util.Scanner;
public class InputByUser04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Name of Student");

        String name=s.next();
        System.out.println("Enter the roll no.");
        String rollNo=s.next();
        System.out.println("Field of interest");

        Scanner s2=new Scanner(System.in);
        String interest=s.next();

        System.out.println("Hey, my name is "+name+" my roll number is "+rollNo+". " +
                "My Field of interest are "+interest);
    }
}
