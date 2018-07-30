package com.epam.autoparking;

import java.util.HashMap;
import java.util.Iterator;

/**
 * contains method for parking the vehicle.
 * @author Sowmya_Surampalli
 *
 */
public class ParkingService {
	/**method for parking the vehicle.
	 * 
	 * @param parkingSlot HashMap of slot numbers and vehicles.
	 * @param emptySlot slot number where there is no vehicle.
	 * @param vehicleNumber is the id of the vehicle to be parked.
	 * @return 
	 * @return updated parkingslot.
	 */
    public HashMap<Integer, String> park(final HashMap<Integer,
    		String> parkingSlot, final int emptySlot,
    		final String vehicleNumber) {

    	
        int slotNumber;
        HashMap<Integer, String> tempParkingSlot =
        		new HashMap<Integer, String>();
        Iterator<Integer> iterate = parkingSlot.keySet().iterator();
        while (iterate.hasNext()) {
        	slotNumber = iterate.next();
        	tempParkingSlot.put(slotNumber, parkingSlot.get(slotNumber));
        }
        tempParkingSlot.put(emptySlot, vehicleNumber);
        System.out.println("vehicle successfully parked");
        LogOperations log = new LogOperations();
    	log.addVehicleEntryToLog(vehicleNumber);
    	return tempParkingSlot;

    }
}
