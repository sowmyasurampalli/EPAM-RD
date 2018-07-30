package com.epam.autoparking;

import java.util.HashMap;

/**
 * contains method to unpark the vehicle
 * @author Sowmya_Surampalli
 *
 */
public class UnParkingService {

	/**
	 * replaces the vehicle id with ""
	 * @param parkingSlot hashmap for the parking slot
	 * @param slot the slot from which the vehicle has to be removed.
	 */
	public int unPark(final HashMap<Integer,
    		String> parkingSlot, final int slot) {
	    String vehicleId = parkingSlot.put(slot, "");
	    LogOperations log = new LogOperations();
	    log.addVehicleExitToLog(vehicleId);
	    return slot;
	}
}
