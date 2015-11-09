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
     public void 管理職の給料は一律4000000返される() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getSalary(), is(4000000));
     }
     
     @Test
     public void 管理職の役職手当は指定の計算式により計算される() throws Exception {
         // 計算式：給料 * 0.05
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getPositionAllowance(), is(200000));
     }
     
     @Test
     public void 管理職の時間外手当は指定の計算式により計算される() throws Exception {
         // 給料/240 * 0.25 * 残業時間
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
         assertThat(employee.getOvertimeAllowance(30), is(124995));
     }
     
}
