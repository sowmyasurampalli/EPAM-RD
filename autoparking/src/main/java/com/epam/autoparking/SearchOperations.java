package com.epam.autoparking;

import java.util.HashMap;
import java.util.Iterator;

/**
 * contains methods to search for an empty slot
 * and for searching for the slot in which the vehicle
 * is parked in.
 * @author Sowmya_Surampalli
 *
 */
public class SearchOperations {
	
	/**
	 * method to search for empty slot.
	 * @param parkingSlot hashmap of existing parking slot.
	 * 
	 * @return empty slot number.
	 */
	public int searchEmptySlot(final HashMap<Integer, String> parkingSlot) {
		Iterator<Integer> iterate = parkingSlot.keySet().iterator();
		int slotNumber;
		while (iterate.hasNext()) {
			slotNumber = iterate.next();
			if (parkingSlot.get(slotNumber) == "") {
				return slotNumber;
			}
		}
		return -1;
	}
	
	/**
	 * method to search for parked vehicle
	 * @param parkingSlot hashmap of existing parking slot.
	 * @param vehicleId vehicle id that has to be searched.
	 * @return slot number.
	 */
	public int searchforVehicle(final HashMap<Integer, String> parkingSlot, String vehicleId) {
		Iterator<Integer> iterate = parkingSlot.keySet().iterator();
		int slotNumber;
		while (iterate.hasNext()) {
			slotNumber = iterate.next();
			if (parkingSlot.get(slotNumber).equals(vehicleId)) {
				return slotNumber;
			}
		}
		return -1;
	}

}
