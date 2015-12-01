package edu.javacourse.ru;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample
{
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<String> submit = es.submit(new MyCallable());
        boolean done = submit.isDone();
        System.out.println("IS DONE:" + done);
        Thread.sleep(5000);
        done = submit.isDone();
        try {
            System.out.println("try to get");
            String s = submit.get();
            System.out.println("DONE:" + s);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("IS DONE:" + done);
        es.shutdown();
    }
}

class MyCallable implements Callable<String>
{

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
        }
        Date d = new Date();
        System.out.println("Thread for CALL:" + d.toString());
        return "String";
    }

}

class MyRunnable implements Runnable
{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
        }
        System.out.println("Thread for RUN");
    }

}
