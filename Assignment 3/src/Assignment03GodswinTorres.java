/*
 *  Assessment: Assignment 3 - Solution
 *  Student Name: Godswin Torres
 *  Student Number: 041 028 120
 *  Lab Professor Name: David Haley
 *  Lab Section Number: 321
 *  Due Date: December 5, 2021
 */

/*Assignment 3 pushing local repository to Github and solving the problem below. 
 */
public class Assignment03GodswinTorres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
			roll = (int)(Math.random() * 10) + 1;
			diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		for(int index = 0; index <= diceRolls.length; index++) {  // crashes
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Godswin Torres");

	}

}
