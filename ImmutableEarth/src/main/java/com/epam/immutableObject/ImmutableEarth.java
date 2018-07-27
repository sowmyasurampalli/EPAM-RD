package com.epam.immutableObject;

import java.util.HashMap;
import java.util.Iterator;

/**Making Earth object completely immutable.
 * declaring the class final not to allow extension.
 * @author Surampalli_Sowmya
 *
 */
public final class ImmutableEarth {

	/**
	 *declaring fields as final so that they cannot be changed. 
	 */
	private final int amountOfWater;
	
	/**
	 * declaring fields as final so that they cannot be changed.
	 */
	private final int amountOfLand;
	
	/**
	 * declaring fields as final so that they cannot be changed.
	 */
	private final int numberOfCountries;
	
	/**
	 * adding final to the hashmap so that they cannot be changed.
	 */
	private final HashMap<String, String> countriesCapitals;
	
	/**allowing the constructor to perform copy.
	 *
	 * @param amountOfWater passed field from the calling class
	 * @param amountOfLand passed field from the calling class
	 * @param numberOfCountries passed field from the calling class
	 */
	public ImmutableEarth(final int amountOfWater, final int amountOfLand,
			final int numberOfCountries, final HashMap<String, String> countriesCapitals) {
		this.amountOfLand = amountOfLand;
		this.amountOfWater = amountOfWater;
		this.numberOfCountries = numberOfCountries;
		/**
		 * performing deep copy.
		 */
		HashMap<String, String> newCountriesCapitals =
				new HashMap<String, String>();
		String country;
		Iterator<String> iterate = countriesCapitals.keySet().
				iterator();
		while (iterate.hasNext()) {
			country = iterate.next();
			newCountriesCapitals.put(country,
					countriesCapitals.get(country));
		}

		this.countriesCapitals = newCountriesCapitals;
	}

	/** providing only getter method to return the field
	 * of copy of the object.
	 * @return field of the object as per passed value
	 */
	public int getAmountOfWater() {
		return amountOfWater;
	}

	/**providing only getter method to return the field
	 * of copy of the object.
	 * @return field of the object as per passed value
	 */
	public int getAmountOfLand() {
		return amountOfLand;
	}

	/**providing only getter method to return the field
	 * of copy of the object.
	 * @return field of the object as per passed value
	 */
	public int getNumberOfCountries() {
		return numberOfCountries;
	}

	public HashMap<String, String> getCountriesCapitals() {
		return countriesCapitals;
	}

	/**providing only getter method to return the field
	 * of copy of the object.
	 *
	 * @return field of the object as per passed value
	 */
	

}
