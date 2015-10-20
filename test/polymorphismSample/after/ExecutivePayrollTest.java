package polymorphismSample.after;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 役員給与クラステスト
 * @author kinoshita_h
 */
public class ExecutivePayrollTest {
       
     private final String className = "ExecutivePayroll";
    
     @Test
     public void getSalaryで給料を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(10000000));
     }
     
     @Test
     public void getPositionAllowanceで役職手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(), is(1000000));
     }
     
     @Test
     public void getOvertimeAllowanceで時間外手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30),is(0));
     }
     
}
