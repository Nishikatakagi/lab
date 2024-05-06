/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static String inputString(String mes) {
        System.out.print(mes);
        String temp = sc.nextLine();
        return temp;
    }

    public static String getDate(String mes) {
        System.out.print(mes);
        String Date = sc.nextLine();
        try {
            if (isDate(Date)) {
                return Date;
            }
        } catch (ParseException e) {
            // Xử lý khi có lỗi ParseException
            System.out.println("Ngày không hợp lệ!");
            getDate("Date: ");
        }
        return null;
    }

    public static boolean isDate(String result) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = format.parse(result);
        if (result.equalsIgnoreCase(format.format(date))) {
            return true;
        }
        return false;
    }

    public static double inputDouble(String mes) {
        System.out.print(mes);
        double tempD = 0;
        while (true) {
            try {
                tempD = Double.parseDouble(sc.nextLine());
                if (tempD < 8 || tempD > 17.5) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("The number not valid, enter form 8.0 to 17.5");
            }
        }
        return tempD;
    }
    
    public static int intputInt (String mes){
        System.out.print(mes);
        int number = 0;
        while(true){
        try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Please enter number!!! ");
                System.out.print("In-input: ");
            }
        }
        return number;
    }

    public static String inputTaskType(String mes) {
        System.out.print(mes);
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 1 || number > 4) {
                    throw new NumberFormatException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Not correct\nEnter 1 for Code/ 2 for Test/ 3 for Design/ 4 for Review ");
                System.out.print("In-input: ");
            }
        }
        switch (number) {
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";

        }
        return null;
    }
}
