package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;




public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 40;
    int y = 40;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    
    
     @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
        
    }

    @Override
    public void setup() {
    	
    	
    	back = loadImage("_06_frogger/froggerBackground.png" );
    	back.resize(WIDTH, HEIGHT);
        carLeft = loadImage("_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("_06_frogger/frog.png");
        frog.resize(75,75);
        
        
        
        
    }

    @Override
    public void draw() {

    	background(10, 30, 30);
    	
    	fill(0, 100, 0);
    	
    	ellipse(x,y, width, height);
    	
    	background(back);
        image (carLeft,250,360);
        image (carRight,250, 210);
        image (frog, 300, 530);
        
        
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
   public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y= y+10;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y= y-10;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	
            	x= x+10;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x= x-10;
            }
        }
    }
    
    void outCanvas()
    {
    	if(x>=800)
    	{
    		x=750;
    	}
    	if(y>=600)
    	{
    		y=550;
    	}
    }
    
    
    	
    	boolean intersects(Car car) {
    		 if ((y > car.getY() && y < car.getY()+50) &&
    		                (x > car.getX() && x < car.getX()+car.getSize())) {
    		   return true;
    		  }
    		 else  {
    		  return false;
    		 }
    	
    }
    
    
}

	







