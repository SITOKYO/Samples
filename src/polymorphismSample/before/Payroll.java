package polymorphismSample.before;

/**
 * 給与クラス
 * @author kinoshita_h
 */
public class Payroll {
    /**
     * 給料を取得する
     * @param type 役職
     * @return 給料
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
     * @param type 役職
     * @param salary 給料
     * @return 役職手当
     */
    public int getPositionAllowance(String type, int salary){
        int positionAllowance = 0;
        if (type.equals("役員")){
            positionAllowance = (int)(salary * 0.1);
        } else if (type.equals("管理職")){
            positionAllowance = (int)(salary * 0.05);
        }
        return positionAllowance;
    }
    
    /**
     * 時間外手当を取得する
     * @param type 役職
     * @param overtime 残業時間
     * @param salary 給料
     * @return 時間外手当
     */
    public int getOvertimeAllowance(String type, int overtime, int salary){
        int overtimeAllowance = 0;
        if (type.equals("管理職")){
            overtimeAllowance = (int)(salary /240 * 0.25 * overtime);
        } else if (type.equals("一般職")){
            overtimeAllowance = (int)(salary /160 * 0.25 * overtime);
        }
        return overtimeAllowance;
    }
}
