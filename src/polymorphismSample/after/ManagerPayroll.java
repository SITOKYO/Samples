package polymorphismSample.after;

/**
 * 管理職給与クラス
 * @author kinoshita_h
 */
public class ManagerPayroll implements EmployeePayroll{
    private int salary = 0;
    private int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    public ManagerPayroll(){
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
        salary = 4000000;
    }
    
    private void calculationPositionAllowance() {
        positionAllowance = (int)(salary * 0.05);
    }
    
    private void calculationOvertimeAllowance(int overtime) {
        overtimeAllowance = (int)(salary/240 * 0.25 * overtime);
    }   
}
