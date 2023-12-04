package basicStats;
/*
START

Initialize variable userInput to collect values
Initialize variable newValue (set equal to 0) 
Initialize variable userTotal to store the total values from userInput
Initialize variable avgTotal to later calculate the userInput values
Initialize variable minValue; set equal to a large value
Initialize variable maxValue; set equal to 0
Initialize variable totalInt for calculating 20% of total
Initialize variable count; to keep track of how many times the while loop can loop

WHILE LOOP count < 5; to make sure that the userInput is 5 numbers total
Prompt the user to enter a number
Read userInput from the user
update totalValue
update maximum → using the math function to compare the maxValue with userInput
update minimum → using the math function to compare the minValue with userInput
increment count by 1	

THEN calculate:
avgTotal by dividing totalValue
totalValue * .20

FINALLY 
Display the results calculated
TOTAL: + totalValue
AVERAGE: + avgTotal
MAXIMUM: + maxValue
MINIMUM + minValue
INTEREST ON TOTAL AT 20% + totalValue 
 	
END
*/

import java.util.Scanner;
public class CalculatingMaxMinAverage {

	public static void main(String[] args) {
		
	
		double userInput;
		double totalValue = 0;
		double avgTotal = 0;
		double maxValue = 0;							    // I set the maximum value to zero, so the max value will obviously replace the initial value to userInput
		double minValue = 999999999;						// I set minimum value to some ridiculous value, so the min value will obviously replace the initial value to userInput
		double totalInt;
		int count = 0;

		Scanner scnr = new Scanner(System.in);

		while (count < 5) {
			System.out.println("Enter a value: ");
			userInput = scnr.nextDouble();
	
			totalValue += userInput;						// Adding all the userInput to find the userTotal
			maxValue = Math.max(maxValue, userInput);		// Math function found the maxValue & minValue, the maxValue/minValue is compared to userInput, then number is stored
			minValue = Math.min(minValue, userInput);
	
			count++;										// while loop iterates as long as count is less than 5
		}
		scnr.close();

		avgTotal = totalValue / count;						// Find average by taking totalValue divided by count
		totalInt = totalValue * .20;						// 20% times totalValue

		System.out.printf("Total: %.2f", totalValue);		// Print all the calculations
		System.out.println("");								
		System.out.printf("Average: %.2f", avgTotal);
		System.out.println("");
		System.out.printf("Maximum: %.2f", + maxValue);
		System.out.println("");
		System.out.printf("Minimum: %.2f", minValue);
		System.out.println("");
		System.out.print("Interest on " + totalValue + " @ 20%: ");
		System.out.printf("%.2f", totalInt);
		

	}

}