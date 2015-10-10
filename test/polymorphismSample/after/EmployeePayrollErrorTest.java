package polymorphismSample.after;

import org.junit.Test;

/**
 * 従業員給与エラーテスト
 * @author kinoshita_h
 */
public class EmployeePayrollErrorTest {
    
     private final String className = "InvalidClassName";
    
     @Test(expected = ClassNotFoundException.class)
     public void get不正な役職名で給料を取得するとException() throws Exception {
         EmployeePayroll employee = EmployeePayrollFactory.getEmployeePayrollInstanse(className);
     }
}
