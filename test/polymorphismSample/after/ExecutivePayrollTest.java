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
     public void 役員の給料は一律10000000返される() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(10000000));
     }
     
     @Test
     public void 役員の役職手当は指定の計算式により計算される() throws Exception {
         // 計算式：給料 * 0.1
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(), is(1000000));
     }
     
     @Test
     public void 役員の時間外手当は一律0返される() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30),is(0));
     }
     
}
