/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.before;

import java.util.List;
import java.util.Map;

/**
 * 給与クラス
 * @author kinoshita_h
 */
public class Payroll {
    //int salary = 0;
    
    /**
     * 給料を取得する
     * @param type
     * @return
     */
    public int getSalary(String type){
        int salary = 0;
        if (type.equals("役員")){
            salary = 10000000;
        } else if (type.equals("管理職")){
            salary = 4000000;
        } else if (type.equals("一般職")){
            salary = 2500000;
        }
        return salary;
    }

    /**
     * 役職手当を取得する
     * @param type
     * @return
     */
    public int getPositionAllowance(String type, int baseAmount){
        int positionAllowance = 0;
        if (type.equals("役員")){
            positionAllowance = (int)(baseAmount * 0.1);
        } else if (type.equals("管理職")){
            positionAllowance = (int)(baseAmount * 0.05);
        }
        return positionAllowance;
    }
    
    /**
     * 時間外手当を取得する
     * @param type
     * @return
     */
    public int getOvertimeAllowance(String type, int overtime, int baseAmount){
        int overtimeAllowance = 0;
        if (type.equals("管理職")){
            overtimeAllowance = (int)(baseAmount/240 * 0.25 * overtime);
        } else if (type.equals("一般職")){
            overtimeAllowance = (int)(baseAmount/160 * 0.25 * overtime);
        }
        return overtimeAllowance;
    }
}
