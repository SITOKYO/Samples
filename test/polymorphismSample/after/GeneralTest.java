/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

import polymorphismSample.after.Employee;
import polymorphismSample.after.EmployeeFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author kinoshita_h
 */
public class GeneralTest {
       
    public GeneralTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     private final String type = "一般職";
    
     @Test
     public void get給料() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getSalary(), 2500000);
     }
     
     @Test
     public void get役職手当() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getPositionAllowance(3333333), 0);
     }
     
     @Test
     public void get時間外手当() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getOvertimeAllowance(30, 300000), 14062);
     }
     
}
