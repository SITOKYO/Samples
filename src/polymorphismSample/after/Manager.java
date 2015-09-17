/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

/**
 * 管理職クラス
 * @author kinoshita_h
 */
public class Manager implements Employee{

    @Override
    public int getSalary() {
        return 4000000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return (int)(baseAmount * 0.05);
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return (int)(baseAmount/240 * 0.25 * overtime);
    }
    
}
