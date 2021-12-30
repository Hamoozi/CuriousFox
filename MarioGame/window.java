package MarioGame;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
import MarioGame.Game;



public class Window extends Canvas{
    // public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9, SCALE = 4;
    // public static final String title = "Super Mario bros";

    // setting dimensions
    
    

    public Window(int HEIGHT, int WIDTH, String TITLE, Game game){
        JFrame frame = new JFrame(TITLE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        game.start();
        

    }

}