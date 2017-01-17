package animal;
import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(5);
		Tortoise.setY(300);
		
		for (int i = 0; i < 10; i++) {
			int x = new Random().nextInt(250);
			if(x <50){
				houses("small", "Green");
			}
			else if(x>50||x<150){
				houses("medium", "Red");
			}
			else if(x>150||x<250){
				houses("large", "Blue");
			}
			
		}
	
	}
	public static void houses (String height, Color colors){
 	if(height.equals("small")){
		Tortoise.move(60);
		Tortoise.turn(60);
		Tortoise.move(60/3);
		Tortoise.turn(60);
		Tortoise.move(60/3);
		Tortoise.turn(60);
		Tortoise.move(60);
		Tortoise.turn(270);
		Tortoise.setPenColor(PenColors.Greens.Green);	
		Tortoise.move(30);
		Tortoise.setPenColor(colors);
		Tortoise.turn(-90);
	}
	else if(height.equals("medium")){
	Tortoise.move(120);
	Tortoise.turn(60);
	Tortoise.move(120/3);
	Tortoise.turn(60);
	Tortoise.move(120/3);
	Tortoise.turn(60);
	Tortoise.move(120);
	Tortoise.turn(270);
	Tortoise.setPenColor(PenColors.Greens.Green);	
	Tortoise.move(30);
	Tortoise.setPenColor(colors);
	Tortoise.turn(-90);
	 }
	 else if(height.equals("large")){
		 Tortoise.move(250);
			Tortoise.turn(60);
			Tortoise.move(250/3);
			Tortoise.turn(60);
			Tortoise.move(250/3);
			Tortoise.turn(60);
			Tortoise.move(250);
			Tortoise.turn(270);
			Tortoise.setPenColor(PenColors.Greens.Green);	
			Tortoise.move(30);
			Tortoise.setPenColor(colors);
			Tortoise.turn(-90);
	 }
		
}
		
		
	}

