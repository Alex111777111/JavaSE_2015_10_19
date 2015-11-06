package edu.javacourse.array.cons;

public class SingleClass
{
    public static final String CONTS = "123123";
    
    private static SingleClass instance;
    
    private SingleClass() {
    }

    public static SingleClass getInstance() {
        if(instance == null) {
            instance = new SingleClass();
        }
        return instance;
    }
    
}
