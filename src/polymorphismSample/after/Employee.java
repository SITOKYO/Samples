/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

/**
 * 従業員インタフェース
 * @author kinoshita_h
 */
public interface Employee {
    public int getSalary();
    public int getPositionAllowance(int baseAmount);
    public int getOvertimeAllowance(int overtime, int baseAmount);
}
