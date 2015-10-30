package edu.javacourse.inter;

public interface TestInterface
{
    public void sayHello();
}

class Test1 implements TestInterface
{
    @Override
    public void sayHello() {
        System.out.println("Hello 01");
    }
}

class Test2 implements TestInterface
{
    @Override
    public void sayHello() {
        System.out.println("Hello 02");
    }
}

class Test3 implements TestInterface
{
    @Override
    public void sayHello() {
        System.out.println("Hello 03");
    }
}
