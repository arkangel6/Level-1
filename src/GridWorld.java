
import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.*;

public class GridWorld {
	public static void main(String[] args) {
	World world = new World();
	world.show();
	Flower l = new Flower();
	
	Bug bugg = new Bug();
	Location bugblue = new Location(0, 0);
	Location bugbluee = new Location(0, 1);
	world.add(bugblue, bugg);
	world.add(bugbluee, l);
	bugg.setColor(Color.BLUE);
	Bug buggg = new Bug();
	Location bugGreen = new Location(1,3);
	world.add(bugGreen, buggg);
	int x = new Random().nextInt(10);
	
	for (int i = 0; i < 10; i++) {
		Location flower = new Location(2,i);
		Location flower2 = new Location(3,i);
		Location flower3 = new Location(4,i);
		Location flower4 = new Location(5,i);
		Location flower5 = new Location(6,i);
		Location flower6 = new Location(7,i);
		l.setColor(Color.GRAY);
		world.add(flower, l);
		world.add(flower2, l);
		world.add(flower3, l);
		world.add(flower4, l);
		world.add(flower5, l);
		world.add(flower6, l);
		
	}
	for (int i = 0; i < 4; i++) {
		Location bugblueee = new Location(x+i, x);
		Location bugblueeee = new Location(x+x, x+i);
		world.add(bugblueee, bugg);
		world.add(bugblueeee, bugg);
		bugg.setColor(Color.YELLOW);
	}
	}
}
