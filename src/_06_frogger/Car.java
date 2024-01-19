package _06_frogger;

import processing.core.PApplet;
public class Car extends PApplet
{
	int x;
	int y; 
	int size;
	int speed;
	

	void display()
	  {
	    fill(0,255,0);
	    rect(x , y,  size, 50);
	  }
	
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	int getSize()
	{
		return size;
	}


void movement()

{
speed=10;

x=-speed;


if(x>0)
{
	x=WIDTH;
}
	
}

}


