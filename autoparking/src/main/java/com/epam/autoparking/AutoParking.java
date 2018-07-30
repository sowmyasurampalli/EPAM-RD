package com.epam.autoparking;

import java.util.HashMap;

/**
 * main class.
 * @author Sowmya_Surampalli
 *
 */
public class AutoParking {

	/**
	 * main method.
	 * @param args no arguments.
	 */
	public static void main(String[] args) {
	
    HashMap<Integer, String> parkingSlot = new HashMap<Integer, String>();
	AutoParking autoparking = new AutoParking();
	boolean status = autoparking.dealAdminMenu();
	if(status) {
		InitializeParkingSlot initialize = new InitializeParkingSlot();
		parkingSlot = initialize.initialize(30);
	}
	
	while(status) {
		int choice = autoparking.dealWithCustomerMenu();
		switch(choice){
			case 1: ParkingService park = new ParkingService();
			        String vehicle = autoparking.getVehicleNumber();
			        SearchOperations search = new SearchOperations();
			        int emptySlot = search.searchEmptySlot(parkingSlot);
			        System.out.println(emptySlot);
			        Validations validate = new Validations();
			        if(validate.validateParkingSlotSize(30, emptySlot)) {
			        	ParkingService parkingService = new ParkingService();
			        	parkingService.park(parkingSlot, emptySlot, vehicle);
			        }
			
		}
	
	
	}
		
	}

	/**
	 * prints admin menu and returns the validation result.
	 * @return validation result.
	 */
	public boolean dealAdminMenu() {
	    System.out.println("Enter admin id:");
	    GetInputFromUser inputReaderObject = new GetInputFromUser();
	    String adminId = inputReaderObject.getString();
	    System.out.println("Enter admin password:");
	    String password = inputReaderObject.getString();
	    Validations validate = new Validations();
	    boolean status = validate.validateAdmin(adminId, password);
	    return status;
	}

	/**
	 * prints customer menu.
	 */
	public int dealWithCustomerMenu() {
		System.out.println("Menu:");
		System.out.println("1. Park the vehicle");
		System.out.println("2. Unpark the vehicle");
		System.out.println("Enter your choice:");
		GetInputFromUser inputreaderObject = new GetInputFromUser();
		return inputreaderObject.getInteger();
	}
	
	public String getVehicleNumber() {
		System.out.println("Enter vehicle number:");
		GetInputFromUser inputreaderObject = new GetInputFromUser();
		return inputreaderObject.getString();
	}
	
}
