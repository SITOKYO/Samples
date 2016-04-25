package polymorphismSample.after;

/**
 * 役員給与クラス
 * @author kinoshita_h
 */
public class ExecutivePayroll implements EmployeePayroll{

    private int salary = 0;
    private int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    public ExecutivePayroll(){
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
        salary = 10000000;
    }
    
    private void calculationPositionAllowance() {
        positionAllowance = (int)(salary * 0.1);
    }
    
    private void calculationOvertimeAllowance(int overtime) {
        overtimeAllowance = 0;
    }
}
