public class ReferenceExample
{
    public static void main(String[] args) {
        
        Person p = new Person("F1", "L1");
        System.out.println("Before:" + p.firstName);
        change(p);
        System.out.println("After:" + p.firstName);
        
    }
    
    static void change(Person person) {
        person.firstName = "F2";
        person = new Person("F3", "L3");
    }
}
