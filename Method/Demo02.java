package Method;

public class Demo02 {
    int id=632;
    String name="Abhishek";
    static String collegeName="Diet satara";

    public static void main(String[] args) {
        System.out.println(Demo02.collegeName);
        Demo02 ref=new Demo02();
        System.out.println(ref.id);
        System.out.println(ref.name);
    }
}
