package Method;
//Static Method: Method which is outside the main method ,blocks,constructor with static modifier.
//we can access them directly without creating object by className.[className.refName( of that static member)]
public class Demo04_StaticMethod {
    static int add(int number1,int number2){
        return number1+number2;
    }

    public static void main(String[] args) {
        System.out.println(Demo04_StaticMethod.add(30,54));
    }
}
