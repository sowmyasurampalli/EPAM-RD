package epam_RDBatch.conversions_using_factoryPattern;

/**implements Conversion interface to override convert method.
 *
 * @author Sowmya_Surampalli
 *
 */
public class ConvertFromInchToMeters implements Conversion {
/**
 * conversion constant to be multiplied for conversion.
 */
private final double CONVERSION_CONSTANT = 0.254;

    /**
     * overrides convert method.
     * @param inches to be converted.
     * @return value after conversion.
     */
    public double convert(final double inches) {
		return inches * CONVERSION_CONSTANT;
	}


}
