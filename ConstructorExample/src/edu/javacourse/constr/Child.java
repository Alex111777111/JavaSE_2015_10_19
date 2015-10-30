package edu.javacourse.constr;

import java.util.Date;

public class Child extends Person
{
    private int weight;

    public Child() {
        this("asdada");
        System.out.println("Constructor Child");
    }
    
    public Child(int weight) {
        super(new Date());
        System.out.println("Constructor Child with INT");
        this.weight = weight;
    }

    public Child(String name) {
        super(new Date());
        System.out.println("Constructor Child with NAME");
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
