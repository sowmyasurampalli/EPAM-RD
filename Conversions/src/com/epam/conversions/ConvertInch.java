package com.epam.conversions;

/**contains implemented methods for conversions from inch.
 *
 * @author Surampalli_Sowmya
 *
 */
public class ConvertInch implements ConversionFromInch{

    /**converts from inches into meters.
     *
     */
    @Override
    public double convertFromInchToMeter(final double inches) {
        return inches * 0.254;
    }

    /**converts from inches to feet.
     *
     */
    @Override
    public double convertFromInchToFeet(final double inches) {
        return inches * 0.08334;
    }

}
