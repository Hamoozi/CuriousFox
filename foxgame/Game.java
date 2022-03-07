package foxgame;
import java.awt.Canvas;






public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 640, HEIGHT  = WIDTH / 12 * 9, SCALE = 4;
    public static final String TITLE = "Curious Fox";
    private Thread thread;
    private boolean running = false;

    public Game(){
        new Window(HEIGHT * SCALE, WIDTH * SCALE, TITLE, this);
    }
    protected synchronized void start(){
    	
    	if(running) return;
    	running = true;
    	thread = new Thread(this, "Thread");
    	thread.start();
   


    }
    protected synchronized void stop(){
    	if(running) return;
    	running = false;
    	try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    public void run(){
    	long lastTime = System.nanoTime();
    	
    	long timer = System.currentTimeMillis();
    	
    	double delta = 0;
    	
    	double ms = 1000000000.0/60.0;
    	
    	int frames = 0;
    	
    	int ticks = 0;
    	
    	while(running) {
    		
    		long now = System.nanoTime();
    		
    		delta += (now-lastTime) / ms;
    		
    		lastTime = now;
    		
    		while(delta>=1) {
    			
    			tick();
    			
    			ticks++;
    			
    			delta--;
    			
    		}
    		
    		render();
    		
    		frames++;
    		if (System.currentTimeMillis() - timer>1000) {
    			
    			timer+=1000;
    			
    			System.out.println(frames + " FPS");
    			
    			frames = 0;
    			
    			ticks = 0;
    			
    		}
    		
    		
    	}
    	stop();


    }
    
    public void render() {
    	
    }

    public void tick() {
    	
    }
    public static void main(String args[]){

        new Game();
        
        

    }
}
