/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Employee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static double getDouble(String meg, String errString, double tail, double head) {
        double n = 0;
        while (true) {
            try {
                System.out.print(meg);
                n = Double.parseDouble(sc.nextLine());
                if (n >= tail && n <= head) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException x) {
                System.out.println(errString);
            }
        }
        return n;
    }

    public static String getString(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }

    public static String getID(String mes, ArrayList<Employee> ls) {
        System.out.print(mes);
        String tempID = null;
        while (true) {
            tempID = sc.nextLine();
            if (!checkExits(tempID,ls)) {
                break;
            } else {
                System.out.println("The ID exits - enter orther code");
            }
        }
        return tempID;
    }
    
    
    
    public static boolean checkExits(String tempCode, ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            if (tempCode.equalsIgnoreCase(list.get(i).getId())) {
                return true;
            }
        }
        return false;
    }
    
}
