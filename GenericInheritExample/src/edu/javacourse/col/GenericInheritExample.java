package edu.javacourse.col;

import java.util.ArrayList;
import java.util.List;

public class GenericInheritExample
{
    public static void main(String[] args) {
        List<MyClass> list1 = new ArrayList<>();
        list1.add(new MyClass("1"));
        list1.add(new MyClass("2"));
        list1.add(new MyClass("3"));
        list1.add(new MyClass("4"));

        printCollection(list1);

        List<MyClass2> list2 = new ArrayList<>();
        list2.add(new MyClass2("2_1"));
        list2.add(new MyClass2("2_2"));
        list2.add(new MyClass2("2_3"));
        list2.add(new MyClass2("2_4"));

        printCollection(list2);
        
        List<MyClass3> list3 = new ArrayList<>();
        list3.add(new MyClass3("33_1"));
        list3.add(new MyClass3("33_2"));
        list3.add(new MyClass3("33_3"));
        list3.add(new MyClass3("33_4"));

        printCollection(list3);
        
    }

    private static void printCollection(List<? extends MyClass> list) {
        for (MyClass my : list) {
            System.out.println(my.sayHello());
        }
    }
}

class MyClass
{
    private String name;

    public MyClass() {
    }

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Say hello for MyClass:" + name;
    }
}

class MyClass2 extends MyClass
{

    public MyClass2() {
    }

    public MyClass2(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Say HELLO for SecondClass:" + getName();
    }
}

class MyClass3 extends MyClass
{
    public MyClass3() {
    }

    public MyClass3(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Say HELLO for Third Class:" + getName();
    }
}