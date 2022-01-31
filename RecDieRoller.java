/**
 * @author Ashleigh Rufus
 * CS215-ON: Assignment 3.1
 * RecDieRoller Class for creating the roll method that
 * will be used to recursively roll a dice to reveal a two
 */
import java.util.Random;

public class RecDieRoller {

	private int face;
	
	/*
	 * Empty-argument constructor
	 */
	public RecDieRoller() {
		face = 6;
	} //end empty-argument constructor
	
	/**
	 * Roll method used to roll the dice for however many times
	 * An if statement is attached that will print a statement when
	 * a two is rolled
	 * @param rolls number of rolls that will be taken
	 */
	public void roll(int rolls) {
		Random random = new Random();
		int result = random.nextInt(face) + 1;
		
		//final int maxRolls = rolls;
		final int newRolls = rolls - 1;
		
		if (result == 2) {
			System.out.println(result);
			System.out.println("It took "  + (1000 - newRolls) +  " roll(s) to get " + result);
		} else {
			System.out.println(result);	
			roll(newRolls);
		} //end if statement
		
	} //end roll
	
} //end RecDieRoller
