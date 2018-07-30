
package epam_RDBatch.conversions_using_factoryPattern;

/**implements Conversion to override convert method.
 * 
 * @author Sowmya_Surampalli
 *
 */
public class ConvertFromMeterToInches implements Conversion {

/**
 * declaring conversion constant.
 */
private final double CONVERSION_CONSTANT = 39.37007;

	/**
	 * override convert method.
	 */
	public double convert(double meters) {
		return meters * CONVERSION_CONSTANT;
	}

}
