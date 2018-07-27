package com.epam.conversions;

/** Contains methods for conversion from inches into different metrics.
 *
 * @author Surampalli_Sowmya
 *
 */
public interface ConversionFromInch {

     /** abstract method for converting inches into meters.
     *
     * @param inches inches
     * @return meters
     */
     double convertFromInchToMeter(double inches);

     /** abstract method for converting inches into feet.
      *
      * @param inches inches
      * @return feet
      */
     double convertFromInchToFeet(double inches);
}
