package Decorator;

public class SmallBall extends Ball {
    protected Ball ball;

    public void decorate(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void Roll() {
        ball.Roll();
        if (ball != null) {
            cylinderNumber = "smallBall";
            ball.cylinderNumber = cylinderNumber;
            System.out.println(String.format("ball roll once, become smallBall."));
        }
    }
}
