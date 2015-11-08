package polymorphismSample.after;

public class Main {
    public static void main(String... args) throws Exception{
        // 役員の給与計算
        EmployeePayroll executivePayroll = 
                EmployeePayrollFactory.getEmployeePayrollInstanse("ExecutivePayroll");
        System.out.println("役員の給料　　　　：" + executivePayroll.getSalary());
        System.out.println("役員の管理職手当　：" + executivePayroll.getPositionAllowance());
        System.out.println("役員の残業手当　　：" + executivePayroll.getOvertimeAllowance(30));
        
        // 管理職の給与計算
        EmployeePayroll managerPayroll = 
                EmployeePayrollFactory.getEmployeePayrollInstanse("ManagerPayroll");
        System.out.println("管理職の給料　　　：" + managerPayroll.getSalary());
        System.out.println("管理職の管理職手当：" + managerPayroll.getPositionAllowance());
        System.out.println("管理職の残業手当　：" + managerPayroll.getOvertimeAllowance(30));
        
        // 一般職の給与計算
        EmployeePayroll generalPayroll = 
                EmployeePayrollFactory.getEmployeePayrollInstanse("GeneralPayroll");
        System.out.println("一般職の給料　　　：" + generalPayroll.getSalary());
        System.out.println("一般職の管理職手当：" + generalPayroll.getPositionAllowance());
        System.out.println("一般職の残業手当　：" + generalPayroll.getOvertimeAllowance(30));
    }
    
}
