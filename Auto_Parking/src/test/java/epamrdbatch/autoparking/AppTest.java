
package epamrdbatch.autoparking;

import com.epam.autoparking.bean.Vehicle;
import com.epam.autoparking.mainpackage.Validation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase {
    /**.
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**.
     * Rigourous Test :-)
     */
    public void testApp() {
        Validation validation = new Validation();
        Vehicle newVehicle = new Vehicle();
        newVehicle.setVehicleNumber("fds");
        newVehicle.setOwnerOfVehicle("asssssssssfg");
        newVehicle.setTypeOfVehicle("aisudhgfjkas");
        assertFalse(validation.validateVehicleId(newVehicle));
    }
}
