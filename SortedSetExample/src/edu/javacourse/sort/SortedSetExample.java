package edu.javacourse.sort;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample
{
    public static void main(String[] args) {

        Set<String> ss = new TreeSet<>();
        ss.add("5");
        ss.add("3");
        ss.add("7");
        ss.add("4");
        ss.add("2");
        for (String s : ss) {
            System.out.println(s);
        }

        Set<MyClass> my = new TreeSet<>();
        my.add(new MyClass("2"));
        my.add(new MyClass("4"));
        my.add(new MyClass("1"));
        my.add(new MyClass("9"));
        my.add(new MyClass("6"));
        my.add(new MyClass("7"));
        for (MyClass mc : my) {
            System.out.println(mc);
        }
    }
}

class MyClass implements Comparable<MyClass>
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

    @Override
    public int compareTo(MyClass o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "MyClass{" + "name=" + name + '}';
    }

}
