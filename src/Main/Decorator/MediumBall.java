package Decorator;

public class MediumBall extends Ball {
    protected Ball ball;

    public void decorate(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void Roll() {
        ball.Roll();
        cylinderNumber = "mediumBall";
        ball.cylinderNumber = cylinderNumber;
        System.out.println(String.format("smallBall roll once, become mediumBall"));
    }
}
