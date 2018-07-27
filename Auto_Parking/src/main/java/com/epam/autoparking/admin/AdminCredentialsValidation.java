
package com.epam.autoparking.admin;

/**
 *
 * @author Surampalli_Sowmya
 *
 */
public class AdminCredentialsValidation {
  /**registered admin ID.
   *
   */
  private String adminId = "sowmya";

  /**registered password.
   *
   */
  private String adminPassword = "krishna";
  /**Validates the credentials of the admin.
   *
   * @param adminIdToValidate is the id that user enters
   * @param adminPasswordToValidate is the password that user enters
   * @return validation status
   */
  public boolean validateAdmin(final String adminIdToValidate,
            final String adminPasswordToValidate) {
    if (adminId.equals(adminIdToValidate)) {
      if (adminPassword.equals(adminPasswordToValidate)) {
        return true;
      } else {
        System.out.println("Wrong password");
        return false;
      }
    } else {
      System.out.println("Invalid Admin ID");
      return false;
    }
  }
}
