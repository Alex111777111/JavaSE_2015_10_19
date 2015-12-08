package edu.javacourse.thread;

public class Ball
{
    public static final int COUNT = 20;

    private boolean isPing = false;

    public synchronized void ping(int n) {
        if (isPing) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("PING:" + n);
        isPing = true;
        notifyAll();
    }

    public synchronized void pong(int n) {
        if (isPing == false) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("PONG:" + n);
        isPing = false;
        notifyAll();
    }
}
