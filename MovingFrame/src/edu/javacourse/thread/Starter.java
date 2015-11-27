package edu.javacourse.thread;

public class Starter
{
    public static void main(String[] args) {
        MovingFrame mf = new MovingFrame();
        MovingThread mt = new MovingThread(mf);
        mt.start();
    }
    
}
