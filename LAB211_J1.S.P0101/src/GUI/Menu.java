/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Manager.ManageEmployee;
import Manager.Validation;
import Object.Employee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Menu {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ManageEmployee ls = new ManageEmployee();
        boolean check = true;

        do {
            System.out.println("*********************");
            System.out.println("       MENU ");
            System.out.println("1. Add employees\n"
                    + "2. Update employees\n"
                    + "3. Remove employees\n"
                    + "4. Search emloyees\n"
                    + "5. Sort employees by salary\n"
                    + "6. Show all employees\n"
                    + "7. Exit");
            System.out.print("Enter for option:");

            String choice = "0";
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Employee e = new Employee();
                    e.input(ls.list);
                    ls.addEmployee(e);
                    break;
                case "2":
                    String tempID = Validation.getString("Enter the ID you wanna update:");
                    if (ls.checkExits(tempID)) {
                        Employee tempE = new Employee();
                        tempE.inputUpdate(tempID);
                        ls.updateEmployee(tempE);
                        System.out.println("Update successfully");
                    } else {
                        System.out.println("ID not found");
                    }
                    break;

                case "3":
                    // nhập vào một ID từ bàn phím
                    String tid = Validation.getString("Enter the ID you wanna remove:");
                    if (ls.checkExits(tid)) {
                        ls.removeEmployee(tid);
                        System.out.println("Remove successfully");
                    } else {
                        System.out.println("ID not found");
                    }
                    break;
                case "4":
                    String text = Validation.getString("Enter name employee you wanna search:");
                    ArrayList<Employee> arrayE = new ArrayList<Employee>();
                    arrayE = ls.searchByName(text);
                    if (arrayE.isEmpty()) {
                        System.out.println("NOT FOUND");
                    } else {
                        System.out.println("THE EMPLOYEES YOU FOUND :");
                        for (Employee employee : arrayE) {
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case "5":
                    ls.sortEmployee();
                    System.out.println("Sort succesfully");
                    break;
                case "6":
                    ls.showAllInfo();
                    break;
                case "7":
                    check = false;
                    break;
                default:
                    System.out.println("Enter number for 1 - 7:");
            }
        } while (check);
    }

}
