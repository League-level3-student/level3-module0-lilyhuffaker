package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot robo[] = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robo.length; i++) {
			robo[i] = new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		robo[0].moveTo(50, 500);
		robo[1].moveTo(150, 500);
		robo[2].moveTo(250, 500);
		robo[3].moveTo(350, 500);
		robo[4].moveTo(450, 500);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random rand = new Random();
		Boolean win = false;
		int winner = 100;
		while(win == false) {
			for (int i = 0; i < robo.length; i++) {
    		robo[i].move(rand.nextInt(50));
    			if(robo[i].getY() < 50) {
    			win = true;
    			winner = i;
    			}
			}
		}
		System.out.println("Robot number "+winner+" Won the race!");
		robo[winner].sparkle();
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    	
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

 }
}
