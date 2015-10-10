package polymorphismSample.after;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 管理職給与クラステスト
 * @author kinoshita_h
 */
public class ManagerPayrollTest {
       
     private final String className = "ManagerPayroll";
    
     @Test
     public void getSalaryで給料を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(4000000));
     }
     
     @Test
     public void getPositionAllowanceで役職手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(111111), is(5555));
     }
     
     @Test
     public void getOvertimeAllowanceで時間外手当を正常取得() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30, 300000), is(9375));
     }
     
}
