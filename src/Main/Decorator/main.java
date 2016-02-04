package Decorator;

public class main {
    public static void main(String args[]) {
        Ball ball = new Ball();
        SmallBall smallBall = new SmallBall();
        MediumBall mediumBall = new MediumBall();

        ball.show();

        smallBall.decorate(ball);
        mediumBall.decorate(smallBall);

        mediumBall.Roll();

        ball.show();
    }
}
