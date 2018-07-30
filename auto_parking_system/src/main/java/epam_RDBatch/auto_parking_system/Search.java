
package epam_RDBatch.auto_parking_system;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * contains methods to perform any search operation in the parking slot.
 * @author Surampalli_Sowmya
 *
 */
public class Search {
		

	public int searchForEmptySlot(HashMap<Integer, Vehicle> parkingSlot) {
		Set entrySet = parkingSlot.entrySet();
		Iterator iterate = entrySet.iterator();
		while (iterate.hasNext()) {
			 Map.Entry me = (Map.Entry) iterate.next();
             if (me.getValue() == null) {
            	 return (Integer) me.getKey();
             }
		}
		return -1;
	}
	
	public int searchForVehicle(HashMap<Integer, Vehicle> parkingSlot, Vehicle vehicle) {
		Set entrySet = parkingSlot.entrySet();
		Iterator iterate = entrySet.iterator();
		while (iterate.hasNext()) {
			Map.Entry me = (Map.Entry) iterate.next();
			if(me.getValue().
		}
	}
}
