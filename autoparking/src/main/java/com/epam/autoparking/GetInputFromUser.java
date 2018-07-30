package com.epam.autoparking;

import java.util.Scanner;

public class GetInputFromUser {

	public String getString() {
		Scanner readFromConsole = new Scanner(System.in);
		return readFromConsole.nextLine();
	}
	

	public int getInteger() {
		Scanner readFromConsole = new Scanner(System.in);
		return readFromConsole.nextInt();
	}
	
}
