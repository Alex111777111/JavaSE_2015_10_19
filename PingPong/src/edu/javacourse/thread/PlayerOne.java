package edu.javacourse.thread;

public class PlayerOne implements Runnable
{
    private Ball ball;

    public PlayerOne(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for (int i = 0; i < Ball.COUNT; i++) {
            try {
                Thread.sleep(((int) (Math.random() * 1000)));
            } catch (Exception e) {
            }
            ball.ping(i);
        }
    }
}
