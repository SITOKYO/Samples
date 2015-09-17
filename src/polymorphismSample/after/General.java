/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

/**
 * 一般職クラス
 * @author kinoshita_h
 */
public class General implements Employee{

    @Override
    public int getSalary() {
        return 2500000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return 0;
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return (int)(baseAmount/160 * 0.25 * overtime);
    }
    
}
