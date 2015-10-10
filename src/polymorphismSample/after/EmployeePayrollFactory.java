package polymorphismSample.after;

/**
 * 従業員給与生成クラス
 * @author kinoshita_h
 */
public class EmployeePayrollFactory {
    
    public static EmployeePayroll getEmployeePayrollInstanse(String className) throws Exception {
        EmployeePayroll employeePayroll = null;
        
        try {
            final String fullyQualifiedClassName = EmployeePayrollFactory.class.getPackage().getName() + "." + className;
            employeePayroll = (EmployeePayroll)Class.forName(fullyQualifiedClassName).newInstance();
        } catch (ClassNotFoundException ex) {
            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        } catch (Exception e) {
            System.err.println("その他エラー");
            throw e;
        }

        return employeePayroll;    
    }
}