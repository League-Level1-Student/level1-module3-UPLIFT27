package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

//world
	
	

	
	


	
	
	
	
	
public static void main (String args[])
		{
	World<Actor> world = new World();
	
	world.show();
	

	int c = 0;
	int r = 0;

	
for(int i=0;i<=99;i++)
{
	
	
	Flower flower = new Flower();
	
	
	
	Location location3 = new Location(r,c);
	
	if((r+c)%2==0)
	{
	flower.setColor(Color.red);
	}
	else
	{
		flower.setColor(Color.white);
	}
	
	world.add(location3, flower);
	
	r++;
	if(r==10)
	{
		c++;
		r=0;
	}
	
		
		}



for(int x= 0; x<=9; x++)
{
Bug bug = new Bug();


bug.setColor(Color.blue);

Location location = new Location(x,x);
world.add(location, bug);
}

int rb = 9;

for(int x2= 0; x2<=9; x2++)
{
Bug bug = new Bug();


bug.setColor(Color.blue);

Location location = new Location(rb,x2);
rb--;
world.add(location, bug);

}









		}
	
	
	
	
	
	
}
