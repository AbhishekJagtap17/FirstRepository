package Method;

public class Demo01 {
    int number1=200;
    int number2=100;
    static int number3=300;
    public static void main(String[] args) {
        int number1=400;
        int number2=200;
        int number3=600;
        System.out.println(number1+number2+number3);
        System.out.println(Demo01.number3);  //To access static variable need classname [className.variableName]
        Demo01 ref=new Demo01();           //To access instance variable need to create object.[className refName=new className()]
        System.out.println(ref.number1);    //By creating object we can access them by reference name.[referenceName.varableName]
        System.out.println(ref.number2);
        System.out.println(Demo01.number3+ ref.number1+ ref.number2);
    }
}
