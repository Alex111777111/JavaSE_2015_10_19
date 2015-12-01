package edu.javacourse.thread;

import java.util.Date;

public class ThreadException
{
    public static void main(String[] args) throws Exception {
        Thread mt = new MyThread();
        mt.start();
        Thread.sleep(1000);
        System.out.println("FINISH");
    }
}

class MyThread extends Thread
{
    @Override
    public void run() {
//        try {
            Date d = null;
            System.out.println(d.toString());
//        } catch (Throwable t) {
//        }
    }
}
