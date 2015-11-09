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
     public void 一般職の給料は一律2500000返される() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(2500000));
     }
     
     @Test
     public void 一般職の役職手当は一律0返される() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(), is(0));
     }
     
     @Test
     public void 一般職の時間外手当は指定の計算式により計算される() throws Exception {
         // 計算式：給料/160 * 0.25 * 残業時間
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30), is(117187));
     }
     
}
