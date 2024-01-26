package _06_frogger;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;




public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 530;
    int vics = 0;
    PImage back;
    PImage frog;
    PImage car;
    
    Car carLeft = new Car(WIDTH, HEIGHT/2+100);
    Car carRight = new Car(0, HEIGHT/2-100); 
    
     @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
        
    }

    @Override
    public void setup() {
    	
    	
    	back = loadImage("_06_frogger/froggerBackground.png" );
    	back.resize(WIDTH, HEIGHT);
        frog = loadImage("_06_frogger/frog.png");
        frog.resize(75,75);
        
        
        car = loadImage("_06_frogger/carLeft.png");
        
        carLeft.loadCar(car);
        car= loadImage("_06_frogger/carRight.png");
        carRight.loadCar(car);
    }

    @Override
    public void draw() {


    	
    	background(10, 30, 30);
    	
    	fill(0, 100, 0);
    	
    	
    	background(back);

        image (frog, x, y);
        
        carLeft.leftmov();
        image(carLeft.display(), carLeft.getX(),carLeft.getY());
        
        carRight.rightmov();
        image(carRight.display(), carRight.getX(), carRight.getY());
        
        if(intersects(carLeft)|| intersects(carRight))
        {
        	JOptionPane.showMessageDialog(null, "You have lost gameover");
        	y=500;
        	x=400;
        	
        }
        if(y<50)
        {
        	vics = vics+1;
        	JOptionPane.showMessageDialog(null, "You have Won"+ vics +"times");
        	y=530; 
        	x=400;
        	carLeft.speeds(vics);
        	carRight.speeds(vics);
        	
        	

        }
        
        
        
        
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
            	y= y-5;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y= y+5;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	
            	x= x+5;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x= x-5;
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

	







