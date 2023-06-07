package Method;
//Instance Method : Method outside block constructor main method without static modifier.
//Need to create object and them call method by referenceName.variableName.
public class Demo03_InstanceMethod {
    int add(int number1,int number2){             // We create Instance Method and accept local Variable .
        return number1+number2;                    //Perform task and return value by using return keyword.
    }

    public static void main(String[] args) {
        Demo03_InstanceMethod d=new Demo03_InstanceMethod();                      //We create object for initailizing method .[className.variableName=new className();]
        System.out.println(d.add(30,50));           // We initailize values and call instance method by object & we return output of that task.

        Demo01 demo01 =new Demo01();                    //we can also call Instance method from another call by creating new object.[ Demo01 ]
        System.out.println(Demo01.number3);                //And also Static Method from that class by className.
        System.out.println( demo01.number1+" "+ demo01.number2);

        Demo02 demo02=new Demo02();                      //we can also call Instance method from another call by creating new object.[ Demo02 ]
        System.out.println(Demo02.collegeName);               //And also Static Method from that class by className.
        System.out.println(demo02.id +" "+demo02.name);

    }
}
