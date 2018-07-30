package epam_RDBatch.auto_parking_system;

public class Vehicle {
	
	/**VehicleNumber accepts both alphabet and numbers.
	   *
	   */
	  private String vehicleNumber;

	  /**Type of vehicle indicates if the vehicle is car or bike etc.
	   *
	   */
	  private String typeOfVehicle = "";

	  /**Name of the owner of vehicle.
	   *
	   */
	  private String ownerOfVehicle = "";

	  /**Getter method for vehicle number.
	   *
	   * @return vehicle number
	   */
	  public String getVehicleNumber() {
	    return vehicleNumber;
	  }

	  /**Setter method for vehicle number.
	   *
	   * @param vehicleNumber Unique identity of the vehicle
	   */
	  public void setVehicleNumber(final String vehicleNumber) {
	    this.vehicleNumber = vehicleNumber;
	  }

	  /**Getter method for typeOfVehicle.
	   *
	   * @return type of vehicle
	   */
	  public String getTypeOfVehicle() {
	    return typeOfVehicle;
	  }

	  /**Setter method for typeOfVehicle.
	   *
	   * @param typeOfVehicle car/bike etc
	   */
	  public void setTypeOfVehicle(final String typeOfVehicle) {
	    this.typeOfVehicle = typeOfVehicle;
	  }

	  /**getter method for owner of vehicle.
	   *
	   * @return owner of vehicle
	   */
	  public String getOwnerOfVehicle() {
	    return ownerOfVehicle;
	  }

	  /**Setter method for owner of vehicle.
	   *
	   * @param ownerOfVehicle name of the owner of vehicle
	   */
	  public void setOwnerOfVehicle(final String ownerOfVehicle) {
	    this.ownerOfVehicle = ownerOfVehicle;
	  }



}
