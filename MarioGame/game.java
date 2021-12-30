package MarioGame;
import java.awt.Canvas;




public class Game extends Canvas implements Runnable{
    // public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9, SCALE = 4;
    // public static final String title = "Super Mario bros";
    // private Thread thread;
    // private boolean running = false;
    public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9, SCALE = 4;
    public static final String TITLE = "Super Mario bros";

    public Game(){
        new Window(HEIGHT * SCALE, WIDTH * SCALE, TITLE, this);
    }
    public synchronized void start(){
        
        


    }
    public synchronized void stop(){
        

    }
    public void run(){


    }

    public static void main(String args[]){

        new Game();
        
        

    }
}