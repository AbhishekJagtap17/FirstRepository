package MethodAssignment;

public class Assignment20Degree {
    void getDegree() {
        System.out.println("I got a degree.");
    }
    public static void main(String[] args) {
        Undergraduate ref1=new Undergraduate();
        ref1.Undergraduates();
        Postgraduate ref2=new Postgraduate();
        ref2.Postgraduates();
       Assignment20Degree ref3=new Assignment20Degree();
       ref3.getDegree();
    }
}
    class Undergraduate{
        void Undergraduates(){
            System.out.println("I am an undergraduate.");
    }
}
class Postgraduate{
    void Postgraduates(){
        System.out.println("I am an Postgraduate.");
    }
}
