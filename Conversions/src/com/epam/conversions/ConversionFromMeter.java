package com.epam.conversions;

/**contains methods for conversion from meters.
 *
 * @author Surampalli_Sowmya
 *
 */
public interface ConversionFromMeter {

    /**converts from meters to inches.
     *
     * @param meters meters
     * @return inches
     */
     double convertFromMeterToInch(double meters);

     /**converts from meters to feet.
     *
     * @param meters meters
     * @return feet
     */
     double convertFromMeterToFeet(double meters);
}
