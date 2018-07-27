package epamrdbatch.autoparking;

import com.epam.autoparking.admin.Assignment;

import junit.framework.TestCase;

/**Unit test for assignment.
 *
 * @author Surampalli_Sowmya
 *
 */
public class AssignmentTest extends TestCase {

  /**Tests the size of the parking slot after return.
   *
   */
  public void testParkingSlot() {
    int testSize = 10;
    Assignment assignment = new Assignment(testSize);
    int parkingSlotLength = assignment.openParkingSlot().length;
    assertEquals(10, parkingSlotLength, 0.0);

  }
}
