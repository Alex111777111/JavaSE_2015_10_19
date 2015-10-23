public class Person
{
   String firstName;
   String lastName;
   String phone;
   String email;
   
   public Person(String firstName, String lastName) {
       
       this.firstName = firstName;
       this.lastName = lastName;
       phone = "Unknown";
       email = "Unknown";
   }
   
   String getPersonDescription() {
       return firstName + " " + lastName + ", " + phone +", " + email;
   }
   
   void printPerson() {
       String g = getPersonDescription();
       System.out.println(g);
   }
   
   void setEmail(String email) {
       this.email = email;
   }
}
