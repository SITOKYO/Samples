/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

import org.junit.Test;

/**
 *
 * @author kinoshita_h
 */
public class EmployeeErrorTest {
    
     private final String type = "不正な役職名";
    
     @Test(expected = Exception.class)
     public void get不正な役職名で給料を取得するとException() throws Exception {
         Employee employee = EmployeeFactory.getEmployeeInstanse(type);
     }
}
