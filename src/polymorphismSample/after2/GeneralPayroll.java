package polymorphismSample.after2;

/**
 * 一般職給与クラス
 * @author kinoshita_h
 */
public class GeneralPayroll extends EmployeePayroll{
    private final int salary = 2500000;
    private final int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    @Override
    protected int calculationSalary() {
        return salary;
    }
    
    @Override
    protected int calculationPositionAllowance() {
        return positionAllowance;
    }
    
    @Override
    protected int  calculationOvertimeAllowance(int overtime) {
        overtimeAllowance = (int)(salary/160 * 0.25 * overtime);
        return overtimeAllowance;
    }
}
