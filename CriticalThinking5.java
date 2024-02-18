import java.util.Scanner;
public class CriticalThinking5 {
	// Global scanner
	static Scanner scr = new Scanner(System.in);
	// Global variables
	static double s = 0 ;	// variable to add numbers and get final sum
	static int n = 0;	// array index
	static double[] numArray = new double[5];	// array for storing 'n' values
	public static void main(String[] args) {
		System.out.println("You will enter 5 numbers...");	// Inform user of action to take
		getSum(numArray, s, n, scr);	// call recursive method
		// scanner closed after recursive method to avoid potential input stream errors
		scr.close();
	}
	public static void getSum(double[] numArray, double s, int n, Scanner scr) {	// recursive method
		if (n < 5) {	// base case 
			// Prompt user for number
			System.out.println("Enter a number: ");
			numArray[n] = scr.nextDouble();	// array index is assigned scanner value
			// loop for adding values to sum
			s += numArray[n];	// array index value is added to sum
			n++;	// increment array index 
			getSum(numArray, s, n, scr);	// method calls itself
		} else {
			// Display sum of numbers to user 
			System.out.println("The final sum is: " + s);	
		}
	}
}