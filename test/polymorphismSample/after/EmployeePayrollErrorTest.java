package polymorphismSample.after;

import org.junit.Test;

/**
 * 従業員給与エラーテスト
 * @author kinoshita_h
 */
public class EmployeePayrollErrorTest {
    
     private final String type = "不正な役職名";
    
     @Test(expected = Exception.class)
     public void get不正な役職名で給料を取得するとException() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(type);
     }
}
