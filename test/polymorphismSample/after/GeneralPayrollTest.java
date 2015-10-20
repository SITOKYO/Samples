package polymorphismSample.after;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 一般職給与クラステスト
 * @author kinoshita_h
 */
public class GeneralPayrollTest {
 
     private final String className = "GeneralPayroll";
    
     @Test
     public void getSalaryで給料を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(2500000));
     }
     
     @Test
     public void getPositionAllowanceで役職手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(), is(0));
     }
     
     @Test
     public void getOvertimeAllowanceで時間外手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30), is(117187));
     }
     
}
