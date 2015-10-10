package polymorphismSample.after;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 従業員給与生成クラス
 * @author kinoshita_h
 */
public class EmployeePayrollFactory {
    
    public static EmployeePayroll getEmployeePayrollInstanse(String className) throws Exception {
        EmployeePayroll employeePayroll = null;
        
        try {          
            employeePayroll = (EmployeePayroll)Class.forName("polymorphismSample.after." + className).newInstance();
        } catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                System.err.println("クラスの指定が正しくありません");
                throw (ClassNotFoundException)e;
            } else {
                System.err.println("その他エラー");
                throw (Exception)e;
            }
        }

        return employeePayroll;    
    }
}