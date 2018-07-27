package com.epam.autoparking.admin;

import com.epam.autoparking.bean.Vehicle;

/**contains method for creating parking slot.
 *
 * @author Surampalli_Sowmya
 *
 */
public class Assignment {

  /**Array that describes the parking slot.
   *
   */
  private Vehicle[] parkingSlot;

  /**Constructor that assigns size to the parking slot array.
   *
   * @param lengthOfParkingSlot total size of parking slot
   */
  public Assignment(final int lengthOfParkingSlot) {
    parkingSlot = new Vehicle[lengthOfParkingSlot];
  }

  /**Creates an empty parking slot upon admin access.
   *
   * @return Array of slots in parking lot
   */
  public Vehicle[] openParkingSlot() {
    return parkingSlot;
  }
}
