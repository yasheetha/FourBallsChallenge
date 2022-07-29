

import processing.core.PApplet;

public class FourBallsChallenge extends PApplet{
    public static final int WIDTH = 668;
    public static final int HEIGHT = 448;

    public int[] ballSpeed = new int[5];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {

        for (int ball=1;ball<=4;ball++) {
            getEclipseBall(getBallXAxisPosition(ball), getBallYAxisPosition(ball) );
            maintainBallSpeed(ball);
        }


    }

    private int getBallXAxisPosition(int ball) {
        return ballSpeed[ball];
    }

    private int getBallYAxisPosition(int ball) {
        return (ball * HEIGHT)/5;
    }

    private void getEclipseBall(int ballXAxisPosition,int ballYAxisPosition) {
        final int diameter = 10;
        ellipse(ballXAxisPosition, ballYAxisPosition, diameter, diameter);
    }
    private void maintainBallSpeed(int ball) {
        ballSpeed[ball]+= ball;
    }


}
