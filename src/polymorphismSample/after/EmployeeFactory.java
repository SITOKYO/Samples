/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismSample.after;

/**
 * 従業員生成クラス
 * @author kinoshita_h
 */
public class EmployeeFactory {
    
    public static Employee getEmployeeInstanse(String type) throws Exception{
        if (type.equals("役員")){
            return new Executive();
        } else if (type.equals("管理職")){
            return new Manager();
        } else if (type.equals("一般職")){
            return new General();
        } else {
            throw new Exception("従業員の種類の指定がありません");
        }
    }
}
