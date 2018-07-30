package com.epam.autoparking;

import java.util.HashMap;

public class InitializeParkingSlot {

	public HashMap<Integer, String> initialize(int sizeOfParkingSlot) {
		HashMap<Integer,String> parkingSlot = new HashMap<Integer, String>();
		for(int i = 0; i < sizeOfParkingSlot; i++) {
			parkingSlot.put(i, "");
		}
	    return parkingSlot;
	}
}
