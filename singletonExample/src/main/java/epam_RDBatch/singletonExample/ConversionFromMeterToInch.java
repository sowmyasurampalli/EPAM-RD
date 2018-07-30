package epam_RDBatch.singletonExample;

/**
 * singleton design pattern.
 * @author Sowmya_Surampalli
 *
 */
public class ConversionFromMeterToInch {

	/**
	 * create an object of ConversionFromMeterToInch.
	 */
	private static ConversionFromMeterToInch objectForConversion = new ConversionFromMeterToInch();

	/**
	 * declare constructor as private so that no objects can be
	 * instantiated.
	 */
	private ConversionFromMeterToInch() {

	}

	/**
	 * method to return only one instance
	 * @return objectForConversion
	 */
	public static ConversionFromMeterToInch getObject() {
		return objectForConversion;
	}

	/**
	 * conversion constant to be declared as final constant
	 */
	private final double CONVERSION_CONSTANT = 39.37007;

	/**
	 * conversion method.
	 * @param meters meters to be converted.
	 * @return converted metrics.
	 */
	public double convert(final double meters) {
		return meters * CONVERSION_CONSTANT;
	}
}
