package edu.javacourse.inter;

public class InterfaceExample
{
    public static void main(String[] args) {
        SimpleFrame sf = new SimpleFrame();
        
        TestInterface t1 = new Test1();
        TestInterface t2 = new Test2();
        TestInterface t3 = new Test3();
        
        t1.sayHello();
        t2.sayHello();
        t3.sayHello();
    }
}
