package polymorphismSample.after;

/**
 * 一般職給与クラス
 * @author kinoshita_h
 */
public class GeneralPayroll implements EmployeePayroll{
    private int salary = 0;
    private int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    public GeneralPayroll(){
        calculationSalary();
    }
    
    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getPositionAllowance() {
        calculationPositionAllowance();
        return positionAllowance;
    }

    @Override
    public int getOvertimeAllowance(int overtime) {
        calculationOvertimeAllowance(overtime);
        return overtimeAllowance;
    }
    
    private void calculationSalary() {
        salary = 2500000;
    }
    
    private void calculationPositionAllowance() {
        positionAllowance = 0;
    }
    
    private void calculationOvertimeAllowance(int overtime) {
        overtimeAllowance = (int)(salary/160 * 0.25 * overtime);
    }
}
