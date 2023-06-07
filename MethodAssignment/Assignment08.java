package MethodAssignment;

import java.util.Scanner;

public class Assignment08 {
     String displayGrades(int marks) {
        if (100 >= marks && marks >=91) {
            return "AA";
        }else if (90 >= marks && marks >= 81) {
            return "AB";
        } else if (80 >= marks && marks >= 71) {
            return "BB";
        } else if (70 >= marks && marks >= 61) {
            return "BC";
        } else if (60 >= marks && marks >= 51) {
            return "CD";
        } else if (50 >= marks && marks >= 41) {
            return "DD";
        } else if(marks<=40) {
            return "Fail";
        }else{
            return "Invalid Input.";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks= scanner.nextInt();
        Assignment08 a08=new Assignment08();
        System.out.println("Grade : "+a08.displayGrades(marks));
    }
}
