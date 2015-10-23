public class FirstClassApp
{
    public static void main(String[] args) {
        
        Person p1 = new Person("Андрей", "Воронов");
        String email = "sir@pisem.net";
        p1.setEmail(email);
        System.out.println(p1.getPersonDescription());
        
        String ff = "Анна";
        Person p2 = new Person(ff, "Каренина");
        p2.setEmail("karenina@gmail.com");
/*        
        p1.firstName = "Андрей";
        p1.lastName = "Воронов";
        p1.phone = "+723456789";
        p1.email ="andrey@pisem.net";

        Person p2 = new Person();
        p2.firstName = "Анна";
        p2.lastName = "Каренина";
    
        System.out.println(p1.lastName);
        
        Person p3 = p1;
        System.out.println(p3.lastName);
        
        p3 = p2;
        
        String h = p1.getPersonDescription();
        System.out.println(h);
*/        
    }
    
}
