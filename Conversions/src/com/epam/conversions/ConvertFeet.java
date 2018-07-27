package com.epam.conversions;

/**
 * class that implements ConverionfromFeet.
 * @author Surampalli_Sowmya
 *
 */
public class ConvertFeet implements ConversionFromFeet {

    /**converts and returns meters from feet.
     *
     */
    @Override
    public double convertFromFeetToMeter(final double feet) {
        return feet * 0.3048;
    }

    /**converts and returns inches from feet.
     *
     */
    @Override
    public double convertFromFeetToInches(final double feet) {
        return feet * 12;
    }

}
