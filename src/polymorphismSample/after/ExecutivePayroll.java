package polymorphismSample.after;

/**
 * 役員給与クラス
 * @author kinoshita_h
 */
public class ExecutivePayroll implements EmployeePayroll{

    @Override
    public int getSalary() {
        return 10000000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return (int)(baseAmount * 0.1);
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return 0;
    }
    
}
