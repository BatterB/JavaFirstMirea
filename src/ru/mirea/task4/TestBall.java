package ru.mirea.task4;

public class TestBall {
    public static void testBall(){
        Ball ball = new Ball(0.0,0.0);
        System.out.println(ball.toStringBall());
        ball.move(30, 15);
        System.out.println(ball.toStringBall());
    }
}
