package com.epam.autoparking;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * addition of logs for entry and exit of cars.
 * @author Sowmya_Surampalli
 *
 */
public class LogOperations {

	HashMap<String, LogBean> logFile = new HashMap<String, LogBean>();
	/**
	 * adds an entry to log file while vehicle enters.
	 * @param vehicleId vehicle number
	 * @return updated log file
	 */
	public HashMap<String, LogBean> addVehicleEntryToLog(
	final String vehicleId) {
		LogBean newlogEntry = new LogBean();
		Timestamp currentTime = new Timestamp(
				System.currentTimeMillis());
		newlogEntry.setInTimeStamp(currentTime);
		newlogEntry.setOutTimeStamp(null);
		logFile.put(vehicleId, newlogEntry);
		return logFile;
	}

	/**
	 * adds an exit to log file while vehicle exits.
	 * @param vehicleId vehicle number
	 * @return updated log file
	 */
	public HashMap<String, LogBean> addVehicleExitToLog(
			final String vehicleId) {

		LogBean existingRecord = logFile.get(vehicleId);
		if (existingRecord.getOutTimeStamp() == null) {
			//exception to be raised.
		} else {
			Timestamp currentTime = new Timestamp(
					System.currentTimeMillis());
			existingRecord.setOutTimeStamp(currentTime);
		}
		logFile.put(vehicleId, existingRecord);
		return logFile;

	}
}
