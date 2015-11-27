package edu.javacourse.ru;

public class ThreadExampleOne 
{
    public static void main(String[] args) {
        int COUNT = 5;
        
        MyThread[] mt = new MyThread[COUNT];
        for(int i=0; i<COUNT; i++) {
            mt[i] = new MyThread("Name:" + i);
        }
        
        for(int i=0; i<COUNT; i++) {
            mt[i].start();
        }
    }
}


class MyThread extends Thread
{
    private String nameThread;

    public MyThread(String nameThread) {
        this.nameThread = nameThread;
    }
    
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Finished:" + nameThread);
        } catch (InterruptedException ex) {
        }
    }
}