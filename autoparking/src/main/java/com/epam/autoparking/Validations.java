package com.epam.autoparking;

/**
 * validation methods.
 * @author Sowmya_Surampalli
 *
 */
public class Validations {

/**admin validation.
 *
 * @param adminId id entered by user
 * @param password password entered by user.
 * @return true if valid and false in else case.
 */
	public boolean validateAdmin(final String adminId,
			final String password) {
		if (adminId.equals("hello") && password.equals("world")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateParkingSlotSize(int parkingSlotSize, int emptySlotNumber) {
		if(emptySlotNumber>parkingSlotSize) {
			return false;
		} else {
			return true;
		}
	}
}
