package polymorphismSample.after;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kinoshita_h
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
    {
        polymorphismSample.after.GeneralPayrollTest.class,
        polymorphismSample.after.ExecutivePayrollTest.class, 
        polymorphismSample.after.ManagerPayrollTest.class, 
        polymorphismSample.after.EmployeePayrollErrorTest.class
    }
)
public class EmployeePayrollTestSuites {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
