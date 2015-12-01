package edu.javacourse.counter;

import java.util.Date;

public class CounterTester 
{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for(int i=0; i<200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);
        
        System.out.println("Counter:" + counter.getCounter());
    }
}
 
class Counter
{
    private long counter = 0L;
    private long counter10 = 0;
    private long counter20 = 0;
    private final Object obj10 = new Object();
    private final Object obj20 = new Object();
    
    public synchronized void increaseCounter() {
        counter++;
    }
    
    public static synchronized void testMethod() {
        
    }
    
    public void addNumber(long number) {
        if(number < 10) {
           synchronized(obj10) {
               counter10 += number;
           } 
        }
        if(number < 20 && number >=10) {
           synchronized(obj20) {
               counter20 += number;
           } 
        }
    }
    
    public Date simpleTest() {
        Date d = new Date();
        d.setTime(12345);
        return d;
    }
    
    public long getCounter() {
        return counter;
    }
}
 
class CounterThread extends Thread
{
    private Counter counter;
    
    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    
    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            counter.increaseCounter();
        }
    }
}