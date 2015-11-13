package initexample;

import java.util.Date;

public class InitExample
{
    private String example; // = "12345";
    private Date dateOfBirth = new Date();
    
    static {
        System.out.println("Static section");
    }
    
    {
        System.out.println("Instance Init");
    }

    public InitExample() {
        System.out.println("Simple constructor");
    }

    public InitExample(String example) {
        this.example = example;
    }
    
    public static void main(String[] args) {
//        InitExample ie1 = new InitExample();
//        System.out.println(ie1.example);
//        InitExample ie2 = new InitExample();
        System.out.println("Hello");
        test();
    }
    
    private static void test() {
        SecondClass sc = new SecondClass();
    }
    
}
