/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Country;
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

    public static String getCode(String mes, ArrayList<Country> ls) {
        System.out.print(mes);
        String tempCode = null;
        while (true) {
            tempCode = sc.nextLine();
            if (!checkExits(tempCode, ls)) {
                break;
            } else {
                System.out.print("The Code exits - enter orther code");
            }
        }
        return tempCode;
    }
    
     public static int getInt(String meg) {
        int n = 0;
        while (true) {
            try {
                System.out.print(meg);
                n = Integer.parseInt(sc.nextLine());
                if (n > 0 ) {
                    break;
                }
                throw new Error();
            } catch (Error x) {
                System.out.println("Enter number form 1 - 5");
            } catch (Exception a){
                System.out.println("You must input digit");
            }
        }
        return n;
    }
    
     public static float getDouble(String meg) {
        float n = 0;
        while (true) {
            try {
                System.out.print(meg);
                n = Float.parseFloat(sc.nextLine());
                if (n > 0 ) {
                    break;
                }
                throw new Error();
            } catch (Error x) {
                System.out.println("Total is greater than zero");
            } catch (Exception a){
                System.out.println("You must input digit");
            }
        }
        return n;
    }

    public static boolean checkExits(String tempCode, ArrayList<Country> ls) {
        for (int i = 0; i < ls.size(); i++) {
            if (tempCode.equalsIgnoreCase(ls.get(i).getCountryCode())) {
                return true;
            }
        }
        return false;
    }

    public static int indexCode(String tempCode, ArrayList<Country> ls) {
        for (int i = 0; i < ls.size(); i++) {
            if (tempCode.equalsIgnoreCase(ls.get(i).getCountryCode())) {
                return i;
            }
        }
        return 0;
    }
}
