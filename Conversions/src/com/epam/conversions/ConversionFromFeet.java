package com.epam.conversions;

/**
 * contains methods for conversions from Feet.
 * @author Surampalli_Sowmya
 *
 */
public interface ConversionFromFeet {

    /** abstract method for converting feet into meters.
    *
    * @param feet feet
    * @return meters
    */
    double convertFromFeetToMeter(double feet);

    /** abstract method for converting feet into inches.
     *
     * @param feet feet
     * @return inches
     */
    double convertFromFeetToInches(double feet);
}
