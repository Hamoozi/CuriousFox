package foxgame;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
/**
 *
 *@author Hamoozi
 */




public class Window extends Canvas{


    //Filling out the dimensions for the window
    //Will cover whole screen
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
