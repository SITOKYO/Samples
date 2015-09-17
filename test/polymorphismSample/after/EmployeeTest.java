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
public class EmployeeTest {
    
    public EmployeeTest() {
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
    
     @Test
     public void getSalary役員() {
         String type = "役員";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getSalary(), 10000000);
     }
     
     @Test
     public void getSalary管理職() {
         String type = "管理職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getSalary(), 4000000);
     }
     
     @Test
     public void getSalary一般職() {
         String type = "一般職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getSalary(), 2500000);
     }
     
     @Test
     public void get役職手当役員() {
         String type = "役員";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getPositionAllowance(2000000), 200000);
     }
     
     @Test
     public void get役職手当管理職() {
         String type = "管理職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getPositionAllowance(111111), 5555);
     }
     
     @Test
     public void get役職手当一般職() {
         String type = "一般職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getPositionAllowance(3333333), 0);
     }
     
     @Test
     public void get時間外手当役員() {
         String type = "役員";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getOvertimeAllowance(30, 300000), 0);
     }
     
     @Test
     public void get時間外手当管理職() {
         String type = "管理職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getOvertimeAllowance(30, 300000), 9375);
     }
     
     @Test
     public void get時間外手当一般職() {
         String type = "一般職";
         EmployeeFactory employeeFactory = new EmployeeFactory();
         Employee employee = employeeFactory.getEmployeeInstanse(type);
         assertEquals(employee.getOvertimeAllowance(30, 300000), 14062);
     }
}
