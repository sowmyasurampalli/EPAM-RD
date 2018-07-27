
package com.epam.autoparking.exceptions;

/**Raises this exception when vehicle is not parked
 * but still queried for unparking.
 * @author Surampalli_Sowmya
 *
 */
public class NotParkedException extends Exception {

  /**Exception to be thrown when the entered vehicle number is not found.
   *
   */
  private static final long serialVersionUID = 1L;

  /**Overrides the toString method from the class Exception.
   * @return A string to be mentioned when this exception occurs
   */
  public String toString() {
    return "No Vehicle with the entered vehicle Number";
  }
}
