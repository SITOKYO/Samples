package polymorphismSample.before;

public class Main {
    
    public static void main(String... args){
        // 役員の給料
        Payroll executivePayroll = new Payroll();
        System.out.println("役員の給料　　　　：" + executivePayroll.getSalary("役員"));
        System.out.println("役員の管理職手当　：" + executivePayroll.getPositionAllowance("役員", 10000000));
        System.out.println("役員の残業手当　　：" + executivePayroll.getOvertimeAllowance("役員", 30, 10000000));

        // 管理職の給与計算
        Payroll managerPayroll = new Payroll();
        System.out.println("管理職の給料　　　：" + managerPayroll.getSalary("管理職"));
        System.out.println("管理職の管理職手当：" + managerPayroll.getPositionAllowance("管理職", 4000000));
        System.out.println("管理職の残業手当　：" + managerPayroll.getOvertimeAllowance("管理職", 30, 4000000));
        
        // 一般職の給与計算
        Payroll generalPayroll = new Payroll();
        System.out.println("一般職の給料　　　：" + generalPayroll.getSalary("一般職"));
        System.out.println("一般職の管理職手当：" + generalPayroll.getPositionAllowance("一般職", 2500000));
        System.out.println("一般職の残業手当　：" + generalPayroll.getOvertimeAllowance("一般職", 30, 2500000));
    }
    
}
