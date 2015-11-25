package polymorphismSample.after2;

/**
 * 管理職給与クラス
 * @author kinoshita_h
 */
public class ManagerPayroll extends EmployeePayroll{
    private final int salary = 4000000;
    private int positionAllowance = 0;
    private int overtimeAllowance = 0;
    
    @Override
    protected int calculationSalary() {
        return salary;
    }
    
    @Override
    protected int calculationPositionAllowance() {
        positionAllowance = (int)(salary * 0.05);
        return positionAllowance;
    }
    
    @Override
    protected int calculationOvertimeAllowance(int overtime) {
        overtimeAllowance = (int)(salary/240 * 0.25 * overtime);
        return overtimeAllowance;
    }   
}
