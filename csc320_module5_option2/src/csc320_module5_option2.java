/*
Develop a Java program that will store data in the form of monthly temperatures for a year.
Store the month and temperature in two different arrays.
Your program should prompt the user for the month to be viewed and display both the month and average temperature.
If "year" is entered, the output for your program should provide the temperature for each month along with the yearly
average as well as the highest and lowest monthly averages.
Use the looping and decision constructs in combination with the arrays to complete this assignment.
*/

import java.util.Scanner;

public class csc320_module5_option2 {
	public static void main(String[] args) {
		//create array named "monthNames" with each month's name included
		String[] monthNames = {"January", "February", "March","April",
				"May", "June", "July", "August",
				"September", "October", "November", "December"
		};
		
		//create array with each month's average temperature included
		int[] monthlyAverageTemp = {50, 55, 60, 65, 70, 75, 80, 75, 70, 65, 60, 55};
		
		System.out.println("Instructions:");
		System.out.println("Enter the name of the month you want to konw the average temperature of.");
		System.out.println("Enter \"year\" to get the average temperature for all months along with yearly average ");
		System.out.println("	yearly average temperature and highest and lowest monthly averages.");

		
	}	
}