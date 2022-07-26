import javafx.scene.layout.Background;
import processing.core.PApplet;
public class fourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter = 12;
    int posOfBallOne = 0;
    int posOfBallTwo = 0;
    int posOfBallThree = 0;
    int posOfBallFour = 0;

    public static void main(String[] args) {
        PApplet.main("fourBalls", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        makeBackgroundWhite();
    }

    private void makeBackgroundWhite() {
        background(235);
    }

    @Override
    public void draw() {
        ellipse(posOfBallOne, HEIGHT/ 5, Diameter, Diameter);
        ellipse(posOfBallTwo, 2 * HEIGHT/ 5, Diameter, Diameter);
        ellipse(posOfBallThree, 3 * HEIGHT / 5, Diameter, Diameter);
        ellipse(posOfBallFour, 4 * HEIGHT / 5, Diameter, Diameter);
        posOfBallOne= (1+posOfBallOne)%WIDTH;
        posOfBallTwo = (2+posOfBallTwo)%WIDTH;
        posOfBallThree = (3+posOfBallThree)%WIDTH;
        posOfBallFour = (4+posOfBallFour)%WIDTH;



    }
}
