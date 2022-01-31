/**
 * RecDieRollerDriver used to instantiate the roll method
 * and test out a large amount of rolls
 * @author Ashleigh's Laptop
 *CS215-ON: Assignment 3.1
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecDieRoller rdr1 = new RecDieRoller();
		rdr1.roll(1000);

		int count = 0;
		while (count < 1000) {
			rdr1.roll(count);
			count++;
		} //end while loop
		
		/*
		 * DISCLAIMER:
		 * There is something off about this due to the average constantly being 1
		 * no matter what the rolls display
		 */
		System.out.println("The mean number of die rolls it takes to get to 2 is: " + (count/1000));
	} //end main

} //end RecDieRoller
