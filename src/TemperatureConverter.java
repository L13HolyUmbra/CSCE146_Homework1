//imports
import java.util.Scanner;

/**
 * @author Dion de Jong 
 * @version 1.0 15 January 2014
 * This program receives a number input in degrees Celsius
 * and converts/outputs a number in degrees Fahrenheit. 
 */ 

//main class
public class TemperatureConverter {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//opening message
		System.out.println("Temperature Converter!");
		System.out.println("I will convert Celsius to Farhenheit");

		//create a scanner
		Scanner keyboard = new Scanner(System.in); 
		//Prompt user to input the celsius temperature
		System.out.println("Please enter the temperature in degrees celcius include decimals if desired"); 
		//store the user's input value
		double CTemp = keyboard.nextDouble(); 
		
		//Apply formula to user's input formula 
		double FTemp = ((9.0/5) * CTemp) + 32.0; 

		//output the converted value and display it for the user
		System.out.println("The temperature is " + FTemp + " degrees Farhenheit");

	}

}
