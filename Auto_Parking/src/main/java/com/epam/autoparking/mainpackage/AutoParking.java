
package com.epam.autoparking.mainpackage;

import com.epam.autoparking.admin.AdminCredentialsValidation;
import com.epam.autoparking.admin.Assignment;
import com.epam.autoparking.bean.Vehicle;
import com.epam.autoparking.exceptions.NotParkedException;
import com.epam.autoparking.service.ParkingService;
import java.util.Scanner;


/**Main class.
 *
 * @author Surampalli_Sowmya
 *
 */
public class AutoParking {

  /**Main class.
   *
   * @param args no arguments
   * @throws NotParkedException Exception from Customer menu method
   */
  public static void main(String[] args) {
    AutoParking ap = new AutoParking();
    boolean adminCorrectCredentials = true;
    Scanner readCredentialsFromConsole = new Scanner(System.in);
    while (adminCorrectCredentials) {
      System.out.println("Enter Admin ID:");
      String adminIdToValidate = readCredentialsFromConsole.nextLine();
      System.out.println("Enter password");
      String passwordToValidate = readCredentialsFromConsole.nextLine();
      //readCredentialsFromConsole.close();
      AdminCredentialsValidation validation = new AdminCredentialsValidation();
      boolean status;
      status = validation.validateAdmin(adminIdToValidate, passwordToValidate);

      if (status) {
        int lengthOfParkingSlot = 0;
        Scanner readNumberOfSlots = new Scanner(System.in);
        System.out.println("Enter the number of parking slots available");
        lengthOfParkingSlot = readNumberOfSlots.nextInt();
        Assignment assignment = new Assignment(lengthOfParkingSlot);
        Vehicle[] parkingSlot = assignment.openParkingSlot();
        //System.out.println(parkingSlot.length);
        try {
          ap.customerMenu(parkingSlot);
        } catch (Exception e) {
          System.out.println(e.toString());
        }
        adminCorrectCredentials = false;
      } else {
        adminCorrectCredentials = true;
      }
    }
    //readCredentialsFromConsole.close();

  }

  /**Prints customer menu and calls appropriate
   * functions as per customer request.
   * @param parkingSlot Array of slots in the parking lot
   * @throws NotParkedException when the customer enters a wrong vehicle ID
   */
  public void customerMenu(Vehicle[] parkingSlot) {
    AutoParking ap = new AutoParking();
    ParkingService parking = new ParkingService();
    boolean parkingChoice = true;
    while (parkingChoice) {
      System.out.println("Menu\n1.Park the vehicle\n2.UnPark the vehicle");
      System.out.println("Enter your choice:");
      Scanner read = new Scanner(System.in);
      int choice = read.nextInt();
      parkingSlot =
             operateBasedOnChoice(parkingSlot, ap, parking, read, choice);
    }
    //customerChoice.close();
  }

  /** Operates based on user choice.
   * @param parkingSlot Slot map based on the parking lot
   * @param ap Auto parking object
   * @param parking Parking Service object to perform parking and unparking
   * @param read Scanner object to read from console
   * @param choice User entered choice
   * @return parking slot array
   */
  private Vehicle[] operateBasedOnChoice(Vehicle[] parkingSlot, AutoParking ap,
         ParkingService parking, Scanner read, int choice) {
    switch (choice) {
      case 1:
        Vehicle newVehicle = ap.readVehicleDetailsFromConsole();
        if (newVehicle != null) {
          parkingSlot = parking.parkVehicle(newVehicle, parkingSlot);
        }
        break;
      case 2:
        System.out.println("Enter Vehicle number");
        int vehicleId = read.nextInt();
        for (int i = 0; i < parkingSlot.length; i++) {
          if (parkingSlot[i] != null) {
            if (parkingSlot[i].getVehicleNumber().equals(vehicleId)) {
              parkingSlot = parking.unParkVehicle(parkingSlot[i], parkingSlot);
              break;
            }
          }
          try {
            checkVehicleParked(parkingSlot, i);
          } catch (NotParkedException e) {
            System.out.println(e.toString());
          }
        }
        break;
      default:System.out.println("Please enter correct choice");
    }
    return parkingSlot;
  }

  /** Checks if vehicle is parked.
   * @param parkingSlot Slot map based on the parking lot
   * @param i index to iterate on parkingSlot array
   * @throws NotParkedException if the user entered car
   * doesn't exist in the parking lot.
   */
  private void checkVehicleParked(final Vehicle[] parkingSlot, final int i)
          throws NotParkedException {
    if (parkingSlot[i] == null && i == parkingSlot.length - 1) {
      throw new NotParkedException();
    }
  }

  /** reads the details of the vehicles from console and
   *  stores it into a Vehicle object.
   *
   * @return Vehicle object
   */
  public Vehicle readVehicleDetailsFromConsole() {
    Scanner read = new Scanner(System.in);
    System.out.println("Enter vehicle ID");
    Vehicle newVehicle = new Vehicle();
    newVehicle.setVehicleNumber(read.next());
    System.out.println("Enter type of vehicle");
    Scanner readString = new Scanner(System.in);
    newVehicle.setTypeOfVehicle(readString.nextLine());
    System.out.println("Enter owner of vehicle");
    newVehicle.setOwnerOfVehicle(readString.nextLine());
    Validation validate = new Validation();
    if (validate.validateVehicleId(newVehicle)) {
      return newVehicle;
    } else {
      System.out.println("Please enter valid Vehicle number");
      return null;
    }

  }


}
