package polymorphismSample.after;

/**
 * 従業員給与インタフェース
 * @author kinoshita_h
 */
public interface EmployeePayroll {
    public int getSalary();
    public int getPositionAllowance();
    public int getOvertimeAllowance(int overtime);
}
