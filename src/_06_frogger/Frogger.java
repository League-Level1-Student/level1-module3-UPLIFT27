package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static final int x = 40;
    static final int y = 40;
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

    	
  
    	
    	
    	
    	back = loadImage("froggerBackground.png");
        carLeft = loadImage("carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("carRight.png");
        carRight.resize(160,100);
        frog = loadImage("frog.png");
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
    
    void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y= y+1;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y= y-1;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	
            	x= x+1;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x= x-1;
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
    
    class Car()
    {
    	int x2;
    	int y2; 
    	int size;
    	int speed;
    	
    
    	void display()
    	  {
    	    fill(0,255,0);
    	    rect(x , y,  size, 50);
    	  }
    	
    	void getX()
    	{
    		
    	}
    	void getY()
    	{
    		
    	}
    	void getSize()
    	{
    		
    	}
    	
    }
    	
    	boolean intersects(Car car) {
    		 if ((frogY > car.getY() && frogY < car.getY()+50) &&
    		                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
    		   return true;
    		  }
    		 else  {
    		  return false;
    		 }
    	
    }
    
    
}
