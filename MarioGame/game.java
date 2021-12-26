package MarioGame;
import java.awt.Dimension;
import java.awt.Canvas;



public class game extends Canvas{
    // setting dimensions
    public static final int WIDTH = 100;
    public static final int HEIGHT = 300;
    public static final int SCALE = 4;

    
    public game(){

        //creating dimensions using Canvas
        Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);



    }
}