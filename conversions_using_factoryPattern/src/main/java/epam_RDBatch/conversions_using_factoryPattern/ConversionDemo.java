package epam_RDBatch.conversions_using_factoryPattern;

/**
 * main class.
 * @author Sowmya_Surampalli
 *
 */
public class ConversionDemo {

	/**
	 * main method that calls both the conversion types.
	 * @param args no parameters
	 */
	public static void main(final String[] args) {
		ConversionSelection conversion = new ConversionSelection();
		Conversion firstConvert = conversion.
				getConversionObject("Inch to Meters");
		System.out.println(firstConvert.convert(43.987));

		Conversion secondConvert = conversion.
				getConversionObject("Meters to Inch");
		System.out.println(secondConvert.convert(65.32));

	}
}
