package MarioGame;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;



public class Window extends Canvas{
    public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9, SCALE = 4;
    public static final String title = "Super Mario bros";

    // setting dimensions
    

    public Window(){
        Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
        

    }
    public static void main(String[] args){
        Window window = new Window();
        JFrame frame = new JFrame(title);
        frame.add(window);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}