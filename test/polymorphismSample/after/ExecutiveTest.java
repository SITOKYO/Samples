/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kinoshita_h
 */
public class ExecutiveTest {
       
     private final String type = "役員";
    
     @Test
     public void getSalary() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertThat(employee.getSalary(), is(10000000));
     }
     
     @Test
     public void get役職手当() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertThat(employee.getPositionAllowance(2000000), is(200000));
     }
     
     @Test
     public void get時間外手当() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
         assertThat(employee.getOvertimeAllowance(30, 300000),is(0));
     }
     
}
