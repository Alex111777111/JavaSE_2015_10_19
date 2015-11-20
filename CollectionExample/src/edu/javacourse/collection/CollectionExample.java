package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample
{

    public static void main(String[] args) {
        List col = new ArrayList();

        col.add(111);
        col.add("12345");
        col.add(new Integer(10));
        col.add((byte) 99);
        col.add(111);
        col.add(111);
        col.add(new Date());
        col.add(new CollectionExample());

        ListIterator it = col.listIterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj.toString());
        }

//        Object get = col.get(col.size()-1);
//        System.out.println(get.toString());
        
        
    }
}
