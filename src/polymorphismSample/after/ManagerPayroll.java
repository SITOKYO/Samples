package polymorphismSample.after;

/**
 * 管理職給与クラス
 * @author kinoshita_h
 */
public class ManagerPayroll implements EmployeePayroll{

    @Override
    public int getSalary() {
        return 4000000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return (int)(baseAmount * 0.05);
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return (int)(baseAmount/240 * 0.25 * overtime);
    }
    
}
