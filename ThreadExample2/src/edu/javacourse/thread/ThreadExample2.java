package edu.javacourse.thread;

public class ThreadExample2 
{
    public static void main(String[] args) {
        for(int i=0; i< 10; i++) {
            MyRunnableClass mt = new MyRunnableClass("" + i);
            Thread thread = new Thread(mt);
            thread.start();
        }
    }
}

class MyRunnableClass implements Runnable
{
    private String threadName;
    
    public MyRunnableClass(String name) {
        threadName = name;
    }
    
    @Override
    public void run() {
        int count = 0;
        while(count < 10) {
            try {
                Thread.sleep(200);
                System.out.println(threadName);
                count++;
            } catch (Exception ex) {
            }
        }
    }
    
}