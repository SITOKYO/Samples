/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

/**
 * 役員クラス
 * @author kinoshita_h
 */
public class Executive implements Employee{

    @Override
    public int getSalary() {
        return 10000000;
    }

    @Override
    public int getPositionAllowance(int baseAmount) {
        return (int)(baseAmount * 0.1);
    }

    @Override
    public int getOvertimeAllowance(int overtime, int baseAmount) {
        return 0;
    }
    
}
