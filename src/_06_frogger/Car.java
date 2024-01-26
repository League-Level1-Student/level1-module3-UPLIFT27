package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Car extends PApplet {
	int x;
	int y;
	int size = 60;
	int speed = 10;
	PImage car;
	
	
	
	public Car(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		
	}
	
	void speeds(int wins)
	{
		if(wins==0)
		{
			speed=10;
		}
		else
		{
			speed=+15;
		}
	}
	
	void loadCar(PImage c)
	{
		car = c;
		
		car.resize(160, 100);
	}

	PImage display() {
		return car;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getSize() {
		return size;
	}

	void leftmov()

	{
		

		x = x-speed;

		if (x < 0) {
			x = Frogger.WIDTH;
		}

	}
	void rightmov()
	{
		x = x + speed;
		if(x>Frogger.WIDTH)
		{
			x= 0;
		}
	}

}
