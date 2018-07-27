
package com.epam.autoparking.mainpackage;

import com.epam.autoparking.bean.Vehicle;

/**Validates if the vehicle number has only characters and numbers.
 *
 * @author Surampalli_Sowmya
 *
 */
public class Validation {

  /**Validates the vehicle number.
   *
   * @param newVehicle Object as per the entry details of the user
   * @return true if the vehicle number is valid and false in the else case
   */
  public boolean validateVehicleId(final Vehicle newVehicle) {
    return newVehicle.getVehicleNumber().matches("[a-zA-Z0-9]+");

  }
}
