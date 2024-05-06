/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {
    static public Scanner sc = new Scanner(System.in);
    
    public static String getString(String mes){
        System.out.print(mes);
        return sc.nextLine();
    }

    public static String getID(String mes, ArrayList<Student> ls) {
        System.out.print(mes);
        String tempCode = null;
        while (true) {
            tempCode = sc.nextLine();
            if (!checkExits(tempCode, ls)) {
                break;
            } else {
                System.out.println("The Code exits - enter orther code");
            }
        }
        return tempCode;
    }

    public static boolean checkExits(String tempCode, ArrayList<Student> ls) {
        for (int i = 0; i < ls.size(); i++) {
            if (tempCode.equalsIgnoreCase(ls.get(i).getID())) {
                return true;
            }
        }
        return false;
    }

    public static int indexCode(String tempCode, ArrayList<Student> ls) {
        for (int i = 0; i < ls.size(); i++) {
            if (tempCode.equalsIgnoreCase(ls.get(i).getID())) {
                return i;
            }
        }
        return 0;
    }
}
