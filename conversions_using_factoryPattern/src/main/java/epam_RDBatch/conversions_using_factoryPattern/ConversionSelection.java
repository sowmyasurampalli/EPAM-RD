package epam_RDBatch.conversions_using_factoryPattern;

/**
 * returns object as per conversion selected.
 * @author Sowmya_Surampalli
 *
 */
public class ConversionSelection {

	/**
	 * returns as per conversion selected.
	 * @param selectedConversion String.
	 * @return object specific to the conversion required.
	 */
	public Conversion getConversionObject(final String selectedConversion) {
		if (selectedConversion.equalsIgnoreCase("Inch To Meters")) {
			return new ConvertFromInchToMeters();
		} else if (selectedConversion.
				equalsIgnoreCase("Meters to Inch")) {
			return new ConvertFromMeterToInches();
		} else {
			return null;
		}
	}
}
