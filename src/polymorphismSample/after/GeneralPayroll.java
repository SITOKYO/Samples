package polymorphismSample.after;

/**
 * 一般職給与クラス
 * @author kinoshita_h
 */
public class GeneralPayroll implements EmployeePayroll{

    @Override
    public int getSalary() {
        return 2500000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return 0;
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return (int)(baseAmount/160 * 0.25 * overtime);
    }
    
}
