package MethodAssignment;

import java.util.Scanner;

public class Assignment21Bank {
    int getBalance(){
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BankA A=new BankA();
        A.getBalance(1000);
        BankB B=new BankB();
        B.getBalance(1500);
        BankC C=new BankC();
        C.getBalance(2000);
    }
}
class BankA{
    void getBalance(int amount){
        System.out.println(amount);;
    }
}
class BankB{
    void getBalance(int amount){
        System.out.println(amount);
    }
}
class BankC{
    void getBalance(int amount){
        System.out.println(amount);;
    }
}

