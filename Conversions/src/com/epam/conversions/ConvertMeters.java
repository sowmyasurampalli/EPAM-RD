package com.epam.conversions;

/**Contains implemented methods for converting  meters.
 *
 * @author Surampalli_Sowmya
 *
 */
public class ConvertMeters implements ConversionFromMeter {

    /**converts from meters to inches.
     *
     */
    @Override
    public double convertFromMeterToInch(final double meters) {
        return meters * 39.37007;
    }

    /**converts from meters to feet.
     *
     */
    @Override
    public double convertFromMeterToFeet(final double meters) {
        return meters * 3.28083;
    }



}
