package genericexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GenericExample 
{
    public static void main(String[] args) {
        
        List r = new ArrayList();
        
        List<String> list = new ArrayList<>();
        list.add("1");
        String str = list.get(0);
        
        for(String s : list) {
        }
        
        for(Iterator<String> it = list.iterator(); it.hasNext();) {
            String next = it.next();
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(new Integer(1), "1111111");
        map.put(2, "2222222");
        for(Integer key : map.keySet()) {
            
        }
        
        List<Map<Integer, String>> list2 = new ArrayList<>();
    }
}
