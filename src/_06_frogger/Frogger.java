package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static final int x = 40;
    static final int y = 40;
    
    
    public class Frogger
    {
    	 x2 = 50;
    	y2 = 50;
    	size = 50;
    	speed=50;
    }
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
        
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

    	background(red, green, blue);
    	fill(red, green, blue);
    	
    	ellipse(x,y, width, height);
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
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
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
    
    void Car(int x2, int y2, int size, int speed)
    {
    	
    }
    
    
}
