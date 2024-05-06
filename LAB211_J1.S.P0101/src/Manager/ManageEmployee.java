/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Employee;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ManageEmployee {
    public ArrayList<Employee> list = new ArrayList();
    
    public void addEmployee(Employee e){
        list.add(e);
    }
    
    public void updateEmployee(Employee e){
        list.set(indexID(e.getId()), e);
    }
    
    public void removeEmployee(String ID){
        list.remove(indexID(ID));
    }
    
    public ArrayList<Employee> searchByName(String text){
        ArrayList<Employee> searchList = new ArrayList<Employee>();
        for (Employee e : list) {
            if(text.equalsIgnoreCase(e.getFirstName()) || text.equalsIgnoreCase(e.getLastName()))
                searchList.add(e);
        }
        return searchList;
    }
    
    public void sortEmployee(){
        for(int i = 0;i< list.size();i++){
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if(list.get(j).getSalary() < list.get(j+1).getSalary()){
                    Employee temEmployee = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, list.get(j));
                }
            }
        }
    }
    
    // lấy vị trí của công nhân trong list theo ID
    public int indexID(String tempCode) {
        for (int i = 0; i < list.size(); i++) {
            if (tempCode.equalsIgnoreCase(list.get(i).getId())) {
                return i;
            }
        }
        return 0;
    }
    
    public void showAllInfo(){
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }
    
    // kiểm tra xem ID có tồn tại trong list không 
     public boolean checkExits(String tempCode) {
        for (int i = 0; i < list.size(); i++) {
            if (tempCode.equalsIgnoreCase(list.get(i).getId())) {
                return true;
            }
        }
        return false;
    }
}
