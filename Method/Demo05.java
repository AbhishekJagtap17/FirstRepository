package Method;

public class Demo05 {
    int a=10;
    static int b=20;
    void m1(){}
    static void m2(){}
    void instanceMethod(){                      //INSTANCE METHOD : ACCESS DIRECTLY IV, IM, SV,SM.
        //Instance Variable:
        System.out.println("Instance Variable :"+a);
        //instance Method :
        m1();  //Instance Method call
        //static Variable:
        System.out.println("Static Variable :"+b);
        //static Method:
        m2();
    }
    void staticMethod(){                          //STATIC METHOD : ONLY SV AND SM ACCESS DIRECTLY , IV & IM NEED OBJECT
       //staic variable:
        System.out.println("Static Variable: "+b);
        //static method :
        m2();

        Demo05 ref=new Demo05();
        //Instance Variable:
        System.out.println("Instance  variable : "+ref.a);
        //Instance method
        m1();
    }
}
