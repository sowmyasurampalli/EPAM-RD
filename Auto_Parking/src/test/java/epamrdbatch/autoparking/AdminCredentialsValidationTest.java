package epamrdbatch.autoparking;

import com.epam.autoparking.admin.AdminCredentialsValidation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AdminCredentialsValidationTest
    extends TestCase {
    /**.
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AdminCredentialsValidationTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AdminCredentialsValidationTest.class);
    }

    /**.
     * Rigourous Test :-)
     */
    public void testApp() {
        AdminCredentialsValidation validation =
                new AdminCredentialsValidation();
        assertTrue(validation.validateAdmin("sowmya", "krishna"));
        assertFalse(validation.validateAdmin("sowmdfgsdj", "krishna"));
        assertFalse(validation.validateAdmin("sowmdfgsdj", "krifdsgjfshna"));
        assertFalse(validation.validateAdmin("", ""));
        assertFalse(validation.validateAdmin("0", "0"));
    }
}







