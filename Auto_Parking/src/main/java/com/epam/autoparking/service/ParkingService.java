
package com.epam.autoparking.service;

import com.epam.autoparking.bean.Vehicle;

/**Contains methods for parking and unparking.
 *
 * @author Surampalli_Sowmya
 *
 */
public class ParkingService {

  /**assigns the vehicle object in the empty parking slot.
   *
   * @param vehicle is the new vehicle to be parked
   * @param parkingSlot is the array of slots in the parking lot
   * @return updated array of slots in the parking
   */
  public Vehicle[] parkVehicle(final Vehicle vehicle, Vehicle[] parkingSlot) {
    Search searchInstance = new Search();
    int emptySlot = searchInstance.searchForEmptySlot(parkingSlot);
    if (emptySlot == -1) {
      System.out.println("No vacant slots");
      return parkingSlot;
    }
    parkingSlot[emptySlot] = vehicle;
    System.out.println("Vehicle successfully parked in slot number "
                 + emptySlot);
    return parkingSlot;
  }

  /**Removes the vehicle from the parking slot.
   *
   * @param vehicle Vehicle to be unparked
   * @param parkingSlot is the array of slots in the parking lot
   * @return updated array of slots in the parking
   */
  public Vehicle[] unParkVehicle(final Vehicle vehicle, Vehicle[] parkingSlot) {
    Search searchInstance = new Search();
    int parkedSlotNumber = searchInstance.
                    searchForVehicle(vehicle, parkingSlot);
    System.out.println(parkedSlotNumber);
    if (parkedSlotNumber == -1) {
      System.out.println("Vehicle not parked");
      return parkingSlot;
    }
    parkingSlot[parkedSlotNumber] = null;
    System.out.println("Vehicle successfully unparked");
    return parkingSlot;

  }

}
