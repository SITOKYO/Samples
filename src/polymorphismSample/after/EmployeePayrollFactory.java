package polymorphismSample.after;

/**
 * 従業員給与生成クラス
 * @author kinoshita_h
 */
public class EmployeePayrollFactory {
    
    public static EmployeePayroll getEmployeePayrollInstanse(String type) throws Exception{
        if (type.equals("役員")){
            return new ExecutivePayroll();
        } else if (type.equals("管理職")){
            return new ManagerPayroll();
        } else if (type.equals("一般職")){
            return new GeneralPayroll();
        } else {
            throw new Exception("従業員の種類の指定がありません");
        }
    }
}
