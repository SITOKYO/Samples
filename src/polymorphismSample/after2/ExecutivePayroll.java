package polymorphismSample.after2;

/**
 * 役員給与クラス
 * @author kinoshita_h
 */
public class ExecutivePayroll extends EmployeePayroll{
    private final int salary = 10000000;
    private int positionAllowance = 0;
    private final int overtimeAllowance = 0;
    
    @Override
    protected int calculationSalary() {
        return salary;
    }
    
    @Override
    protected int calculationPositionAllowance() {
        positionAllowance = (int)(salary * 0.1);
        return positionAllowance;
    }
    
    @Override
    protected int calculationOvertimeAllowance(int overtime) {
        return overtimeAllowance;
    }
}
