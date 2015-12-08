package edu.javacourse.thread;

public class PlayerTwo implements Runnable
{
    private Ball ball;
    
    public PlayerTwo(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for(int i=0; i<Ball.COUNT; i++) {
            try {
                Thread.sleep(((int) (Math.random() * 1000)));
            } catch (Exception e) {
            }
            ball.pong(i);
        }
    }
    
}
