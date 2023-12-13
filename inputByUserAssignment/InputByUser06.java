package inputByUserAssignment;
import java.util.Scanner;

public class InputByUser06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("INPUT:");
        int no=s.nextInt();
        int square=(no*no);
        System.out.println("OUTPUT:" +square);
    }
}
