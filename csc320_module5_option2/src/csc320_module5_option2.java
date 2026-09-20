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
		Scanner scnr = new Scanner(System.in);
		//create array named "monthNames" with each month's name included
		String[] monthNames = {"January", "February", "March","April",
				"May", "June", "July", "August",
				"September", "October", "November", "December"
		};
		
		//create array with each month's average temperature included
		int[] monthlyAverageTemps = {48, 49, 58, 65, 73, 86, 92, 90, 83, 68, 57, 48};

		double yearlyAverage = monthlyAverageTemps[0];		//Yearly average of monthly temperatures, initialized to January
		double maxMonthlyAverage = monthlyAverageTemps[0];	//maximum monthly average temperature, initialized to January
		double minMonthlyAverage = monthlyAverageTemps[0];	//minimum monthly average temperature, initialized to January
		double tempYearTotal = 0;							//temp variable to calculate yearly average
		
		int i;	//iteration variable
		
		//Print program instructions to console.
		System.out.println("Instructions:");
		System.out.println("Enter the name of the month you want to know the average temperature of.");
		System.out.println("Enter \"Year\" to get the average temperatures for all months along with yearly average temperature and highest and lowest monthly averages.");
		System.out.println("");
		System.out.println("Enter one of the following:");
		for (i = 0; i < monthNames.length; ++i) { //Print all elements in monthNames
			System.out.print("\"" + monthNames[i] + "\", ");
		}
		System.out.println("\"Year\"");
		System.out.println("Enter \"Exit\" to quit.");
		
		//Get user input
		String userSelection;
		
		userSelection = scnr.next();		
		
		//main loop to request input and provide data output
		while (!userSelection.equals("Exit")) {

			//for loop through month names only. Year as a separate loop.
			for (i = 0; i < monthNames.length; ++i) {
				//for loop that selects the element chosen, outputs month and average temperature
				if (userSelection.equals(monthNames[i])) {
					System.out.println("You entered \"" + monthNames[i] + "\"");
					System.out.println("The month's average temperature is: " + monthlyAverageTemps[i]);
				}
			}
			
			//check if user input is "Year"
			if (userSelection.equals("Year")) {
				System.out.println ("You entered \"Year\"");
				//for loop printing all months and year average
				for (i = 0; i < monthNames.length; ++i) {
					//outputs all months and average temperature
					System.out.println(monthNames[i] + ": " + monthlyAverageTemps[i]);
				}
				
				//sum monthly averages into tempYearTotal, set max, set min
				for (i = 0; i < monthlyAverageTemps.length; ++i) {
					tempYearTotal += monthlyAverageTemps[i];
					if (monthlyAverageTemps[i] > maxMonthlyAverage) {
						maxMonthlyAverage = monthlyAverageTemps[i];
					}
					if (monthlyAverageTemps[i] < minMonthlyAverage) {
						minMonthlyAverage = monthlyAverageTemps[i];
					}
				}
				
				//Set yearlyAverage to year total divided by 12
				yearlyAverage = tempYearTotal / 12;
				
				//print yearly average
				System.out.print("Yearly average: ");
				System.out.printf("%.1f%n", yearlyAverage);
				
				//print highest monthly average
				System.out.print("Highest monthly average: ");
				System.out.printf("%.1f%n", maxMonthlyAverage);
				
				//print lowest monthly average
				System.out.print("Lowest monthly average: ");
				System.out.printf("%.1f%n", minMonthlyAverage);
			}
			
			//Prompt for next month or year
			System.out.print("Enter next month or \"Year\": ");
			userSelection = scnr.next();
		}
		
		System.out.println("Program exited.");
	}	
}