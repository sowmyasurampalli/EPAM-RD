package epam_RDBatch.singletonExample;

/**
 * main class that calls the conversion methods.
 * @author Sowmya_Surampalli
 *
 */
public class Conversion {

	/**
	 * main method.
	 * @param args no arguments
	 */
	public static void main(final String[] args) {
        ConversionFromMeterToInch conversionObject = ConversionFromMeterToInch.
        		getObject();
        System.out.println(conversionObject.convert(34));

	}

}
