package edu.javacourse.thread;

public class PingPong 
{
    public static void main(String[] args) throws Exception {
        Ball ball = new Ball();
        
        PlayerOne p1 = new PlayerOne(ball);
        PlayerTwo p2 = new PlayerTwo(ball);
        
        new Thread(p1).start();
        new Thread(p2).start();
        
        Thread.sleep(1000);
    }
}
