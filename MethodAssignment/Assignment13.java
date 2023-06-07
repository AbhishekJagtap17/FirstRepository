package MethodAssignment;

import java.util.Scanner;

public class Assignment13 {
    static void perfect(int n) {
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();;
        Assignment13.perfect(n);
        }
    }


