package MarioGame;
import java.awt.Dimension;
import java.awt.Canvas;



public class game extends Canvas implements Runnable{
    public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9;


    public game(){
        Window.main(new String[0]);
    }
    public synchronized void start(){

    }
    public void run(){


    }

    public static void main(String args[]){
        new game();

    }
}