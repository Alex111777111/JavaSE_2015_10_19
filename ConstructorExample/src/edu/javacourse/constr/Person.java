package edu.javacourse.constr;

import java.util.Date;

public class Person
{
    private Date dateOfBirth;

    public Person(Date dateOfBirth) {
        System.out.println("Constructor Person");
       this.dateOfBirth = dateOfBirth; 
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
