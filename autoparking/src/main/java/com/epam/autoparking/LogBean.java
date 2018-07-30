package com.epam.autoparking;

import java.sql.Timestamp;

/**
 * Log details.
 * @author Sowmya_Surampalli
 *
 */
public class LogBean {

	/**
	 * time stamp to store vehicle's in-Time.
	 */
	 private Timestamp inTimeStamp;

	 /**
	  * time stamp to store vehicle's out-time.
	  */
	 private Timestamp outTimeStamp;

	 /**
	  * vehicle number.
	  */
	 private String vehicleNumber;


	 /**
	  * getter method for in time stamp.
	  * @return in-time
	  */
	public Timestamp getInTimeStamp() {
		return inTimeStamp;
	}

	/**
	 * setter method for in time stamp.
	 * @param inTimeStamp timestamp to be set.
	 */
	public void setInTimeStamp(Timestamp inTimeStamp) {
		this.inTimeStamp = inTimeStamp;
	}
	
	/**
	 * getter method for out time stamp.
	 * @return out time
	 */
	public Timestamp getOutTimeStamp() {
		return outTimeStamp;
	}
	
	/**
	 * sets out time stamp.
	 * @param outTimeStamp out time to be set.
	 */
	public void setOutTimeStamp(Timestamp outTimeStamp) {
		this.outTimeStamp = outTimeStamp;
	}
	
	/**
	 * getter method for vehicle number.
	 * @return vehicle number
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	/**
	 * setter method for vehicle number.
	 * @param vehicleNumber vehicle id
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	 
	 

}
