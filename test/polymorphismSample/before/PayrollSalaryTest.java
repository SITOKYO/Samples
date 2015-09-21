package polymorphismSample.before;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kinoshita_h
 */
public class PayrollSalaryTest {
    
     @Test
     public void getSalary役員() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getSalary("役員"), 10000000);
     }
     
     @Test
     public void getSalary管理職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getSalary("管理職"), 4000000);
     }
     
     @Test
     public void getSalary一般職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getSalary("一般職"), 2500000);
     }
     
     @Test
     public void get役職手当役員() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getPositionAllowance("役員", 2000000), 200000);
     }
     
     @Test
     public void get役職手当管理職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getPositionAllowance("管理職", 111111), 5555);
     }
     
     @Test
     public void get役職手当一般職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getPositionAllowance("一般職", 3333333), 0);
     }
     
     @Test
     public void get時間外手当役員() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getOvertimeAllowance("役員", 30, 300000), 0);
     }
     
     @Test
     public void get時間外手当管理職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getOvertimeAllowance("管理職", 30, 300000), 9375);
     }
     
     @Test
     public void get時間外手当一般職() {
         polymorphismSample.before.Payroll payroll = new polymorphismSample.before.Payroll();
         assertEquals(payroll.getOvertimeAllowance("一般職", 30, 300000), 14062);
     }
}
