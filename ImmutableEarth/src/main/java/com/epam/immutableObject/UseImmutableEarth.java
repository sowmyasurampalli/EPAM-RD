
package main.java.com.epam.immutableObject;

import java.util.HashMap;

/**main class to make use of ImmutableEarth.
 *
 * @author Surampalli_Sowmya
 *
 */
public class UseImmutableEarth {

	public static void main(String[] args) {
		
		int amountOfWater = 75;
		int amountOfLand = 25;
		int numberOfCountries = 100;
		HashMap<String, String> countriesCapitals = new HashMap<String, String>();
		countriesCapitals.put("India", "New Delhi");
		countriesCapitals.put("USA", "Washington DC");
		countriesCapitals.put("Canada", "Ottava");
		ImmutableEarth iEarth = new ImmutableEarth(amountOfWater, amountOfLand, numberOfCountries, countriesCapitals);
		
		
		System.out.println(iEarth.getAmountOfLand());
		System.out.println(iEarth.getAmountOfWater());
		System.out.println(iEarth.getNumberOfCountries());
		System.out.println(iEarth.getCountriesCapitals());
	}
}
