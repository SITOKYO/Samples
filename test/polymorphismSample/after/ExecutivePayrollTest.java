package polymorphismSample.after;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 役員給与クラステスト
 * @author kinoshita_h
 */
public class ExecutivePayrollTest {
       
     private final String type = "役員";
    
     @Test
     public void getSalaryで給料を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(type);
         assertThat(employee.getSalary(), is(10000000));
     }
     
     @Test
     public void getPositionAllowanceで役職手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(type);
         assertThat(employee.getPositionAllowance(2000000), is(200000));
     }
     
     @Test
     public void getOvertimeAllowanceで時間外手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(type);
         assertThat(employee.getOvertimeAllowance(30, 300000),is(0));
     }
     
}