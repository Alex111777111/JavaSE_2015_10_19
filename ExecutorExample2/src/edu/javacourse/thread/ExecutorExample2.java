package edu.javacourse.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample2 
{
    public static void main(String[] args) throws Exception {
        int COUNT = 20;
        
        ExecutorService es = Executors.newFixedThreadPool(COUNT);
        List<Future<String>> threadList = new ArrayList<>();
        
        for(int i=0; i<3*COUNT; i++) {
            MyCallable mc = new MyCallable(i);
            Future<String> submit = es.submit(mc);
            threadList.add(submit);
        }

        List<String> strList = new ArrayList<>();
        for(Future<String> f : threadList) {
            try {
                String s = f.get();
                strList.add(s);
            } catch(Exception ex) {
            }
        }
        
//        for(String s : strList) {
//            System.out.println(s);
//        }
        es.shutdown();
    }
}

class MyCallable implements Callable<String>
{
    private int number;
    
    public MyCallable(int number) {
        this.number = number;
    }
    
    @Override
    public String call() throws Exception {
        int d = 3000; // + ((int)(Math.random()*1000));
        try {
            Thread.sleep(d);
            System.out.println("Call is DONE:" + number);
        } catch (Exception ex) {
        }
        return "String:" + d;
    }

}
