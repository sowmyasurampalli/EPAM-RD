
package com.epam.autoparking.service;

import com.epam.autoparking.bean.Vehicle;

/**Contains methods for search operations.
 *
 * @author Surampalli_Sowmya
 *
 */
public class Search {

  /**this method searches for an empty slot in the parking lot.
   *
   * @param parkingSlot is an array of slots in the parking lot
   * @return slot number of the empty slot
   */
  public int searchForEmptySlot(final Vehicle[] parkingSlot) {
    int slotNumber = -1;

    System.out.println(parkingSlot.length);
    for (Vehicle existingVehicle: parkingSlot) {
      slotNumber++;
      if (existingVehicle == null) {
        return slotNumber;
      }
    }
    return 0;
  }

  /** Searches for the vehicle in the parking lot.
   *
   * @param searchVehicle is the vehicle to be searched in the parking lot
   * @param parkingSlot is an array of slots in the parking lot
   * @return  slot number of the search vehicle
   */
  public int searchForVehicle(final Vehicle searchVehicle,
             final  Vehicle[] parkingSlot) {
    int slotNumber = 0;
    for (Vehicle existingVehicle: parkingSlot) {
      if (existingVehicle == searchVehicle) {
        return slotNumber;
      }
      slotNumber++;
    }
    return 0;
  }

}
