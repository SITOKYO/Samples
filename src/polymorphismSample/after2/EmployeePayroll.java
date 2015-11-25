package polymorphismSample.after2;

/**
 * 従業員給与クラス
 * @author kinoshita_h
 */
public abstract class EmployeePayroll {
    private int salary = 0;
    private int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    public EmployeePayroll(){
        this.salary = calculationSalary();
    }
    
    public int getSalary() {
        return salary;
    }

    public int getPositionAllowance() {
        this.positionAllowance =  calculationPositionAllowance();
        return positionAllowance;
    }

    public int getOvertimeAllowance(int overtime) {
        this.overtimeAllowance = calculationOvertimeAllowance(overtime);
        return overtimeAllowance;
    }
    
    protected abstract int calculationSalary();
    
    protected abstract int calculationPositionAllowance();
    
    protected abstract int calculationOvertimeAllowance(int overtime);
}
