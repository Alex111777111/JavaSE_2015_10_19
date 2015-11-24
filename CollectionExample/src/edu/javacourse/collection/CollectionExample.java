package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionExample
{

    public static void main(String[] args) {
        /*
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
        
        Set s = new HashSet();
        
        s.add("12345");
        s.add("12345");
        s.add("12345");
        s.add("12345");
        s.add("12345");
        s.add("12345");
        
        System.out.println("Printing Set =============>");
        for(Iterator it2 = s.iterator(); it2.hasNext();) {
            Object obj = it2.next();
            System.out.println("Object:" + obj);
        }
        */
        
        Map m = new HashMap();
        String ex = "11111";
        m.put("1", ex);
        m.put("2", ex);
        m.put("3", ex);
        Object g = m.get("1");

        for(Object key : m.keySet()) {
            Object value = m.get(key);
            System.out.println("Key:" + key + ":" + key.getClass().getName());
            System.out.println("Value:" + value);
        }
        System.out.println("VALUES =================");
        for(Object value : m.values()) {
            System.out.println("Value:" + value);
        }
        System.out.println("Entry ==================");
        for(Object obj : m.entrySet()) {
            Map.Entry me = (Map.Entry)obj;
            Object key = me.getKey();
            Object value = me.getValue();
            System.out.println("Key:" + key);
            System.out.println("Value:" + value);
        }
        
    }
}
