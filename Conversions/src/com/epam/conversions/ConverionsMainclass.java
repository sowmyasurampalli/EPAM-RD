package com.epam.conversions;

import java.util.Scanner;

/**contains main class.
 *
 * @author Surampalli_Sowmya
 *
 */
public class ConverionsMainclass {

    public static void main(String[] args) {
    	System.out.println("Menu: \n 1. Inch to Feet"
                + " \n 2. Inch to Meter"
		        + " \n 3. Meter to feet"
                + " \n 4. Meter to Inch"
		        + " \n 5. Feet to Inch"
                + " \n 6. Feet to Meter");
    	
    	Scanner readFromConsole = new Scanner(System.in);
    	int choice = readFromConsole.nextInt();
    	
    	switchChoice(choice);
	}

	/**
	 * @param readFromConsole
	 * @param choice
	 */
	private static void switchChoice(int choice) {
		Scanner readFromConsole = new Scanner(System.in);
		switch(choice) {
    	case 1: {
    		convertInchToFeet(readFromConsole);
    		break;
    	}
    	case 2: {
    		convertInchToMeter(readFromConsole);
    		break;
    	}
    	case 3: {
    		convertMeterToFeet(readFromConsole);
    		break;
    	}
    	case 4: {
    		convertMeterToInch(readFromConsole);
    		break;
    	}
    	case 5: {
    		convertFeetToInch(readFromConsole);
    		break;
    	}
    	case 6: {
    		convertFeetToMeter(readFromConsole);
    		break;
    	}
    	default:
    		System.out.println("Exception to be thrown");

    	}
	}

	/** Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertFeetToMeter(final Scanner readFromConsole) {
		System.out.println("Enter Feet:");
		double feet = readFromConsole.nextDouble();
		ConvertFeet convert = new ConvertFeet();
		double meters = convert.convertFromFeetToMeter(feet);
		printToConsole(meters);
	}


	/**Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertFeetToInch(final Scanner readFromConsole) {
		System.out.println("Enter Feet:");
		double feet = readFromConsole.nextDouble();
		ConvertFeet convert = new ConvertFeet();
		double inches = convert.convertFromFeetToInches(feet);
		printToConsole(inches);
	}

	/**Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertMeterToInch(final Scanner readFromConsole) {
		System.out.println("Enter Meters:");
		double meters = readFromConsole.nextDouble();
		ConvertMeters convert = new ConvertMeters();
		double inches = convert.convertFromMeterToInch(meters);
		printToConsole(inches);
	}

	/**Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertMeterToFeet(final Scanner readFromConsole) {
		System.out.println("Enter Meters:");
		double meters = readFromConsole.nextDouble();
		ConvertMeters convert = new ConvertMeters();
		double feet = convert.convertFromMeterToFeet(meters);
		printToConsole(feet);
	}

	/**Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertInchToMeter(final Scanner readFromConsole) {
		System.out.println("Enter inches:");
		double inches = readFromConsole.nextDouble();
		ConvertInch convert = new ConvertInch();
		double meters = convert.convertFromInchToMeter(inches);
		printToConsole(meters);
	}

	/**Reads from console and calls appropriate method.
	 * @param readFromConsole scanner object
	 */
	private static void convertInchToFeet(final Scanner readFromConsole) {
		System.out.println("Enter inches:");
		double inches = readFromConsole.nextDouble();
		ConvertInch convert = new ConvertInch();
		double feet = convert.convertFromInchToFeet(inches);
		printToConsole(feet);
	}

	/**prints to console.
	 *
	 * @param metrics a double value
	 */
	private static void printToConsole(final double metrics) {
		System.out.println(metrics);
	}
}
