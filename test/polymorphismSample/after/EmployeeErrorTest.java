/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kinoshita_h
 */
public class EmployeeErrorTest {
    
    public EmployeeErrorTest() {
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
    
     private final String type = "不正な役職名";
    
     @Test(expected = Exception.class)
     public void get不正な役職名で給料を取得するとException() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getSalary(), 10000000);
     }
}
