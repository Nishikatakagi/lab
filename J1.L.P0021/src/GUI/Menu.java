/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Manager.StudentList;
import Manager.Validation;
import Object.Student;
import java.util.ArrayList;
import sun.java2d.pipe.ValidatePipe;

/**
 *
 * @author user
 */
public class Menu {

    public static void menu() {
        StudentList ls = new StudentList();
        boolean check = true;

        do {
            System.out.println("*********************");
            System.out.println("       MENU ");
            System.out.println("1. create student \n"
                    + "2. Find and Sort\n"
                    + "3. Update/Delete\n"
                    + "4. Reportr\n"
                    + "5. Exit");
            System.out.print("Enter for option:");

            String choice = "0";
            choice = Validation.sc.nextLine();
            switch (choice) {
                case "1":
                    Student e = new Student();
                    e.input(ls.list);
                    ls.createStudent(e);
                    break;
                case "2":
                    String tempID = Validation.getString("Enter the name you wanna find:");
                    // tạo arraylist arrDtu để chứa các student có text tìm được trong list
                    ArrayList<Student> arrStu = ls.findByName(tempID);
                    if (arrStu.isEmpty()) {
                        System.out.println("THERE ARE NOT FOUND !!!");
                    } else {
                        sortByName(arrStu);
                        for (Student student : arrStu) {
                            System.out.println(student.toString());
                        }
                    }
                    break;
                case "3":
                    String tempIDChange = Validation.getString("Enter the ID Student you wanna change:");
                    String userChosse = Validation.getString("Do you want to update(U) or delete(D): ");
                    switch (userChosse) {
                        case "U":
                            if (ls.checkExits(tempIDChange)) {
                                Student tempE = new Student();
                                tempE.inputToUpdate(ls.list, tempIDChange);
                                ls.updateStudent(tempE);
                                System.out.println("Update successfully");
                            } else {
                                System.out.println("ID not found");
                            }
                            break;
                        case "D":
                            if (ls.checkExits(tempIDChange)) {
                                // xóa object tại vị trí i
                                ls.removeStudent(tempIDChange);
                                System.out.println("Remove successfully");
                            } else {
                                System.out.println("ID not found");
                            }
                            break;
                        default: {
                            System.out.println("VALUE NOT VALID!!!");
                        }
                    }
                    break;
                case "4":
                    System.out.println("LIST STUDENT:");
                    ls.report();
                    break;
                case "5":
                    check = false;
                default:
                    System.out.println("Enter number for 1 - 5:");
            }
        } while (check);
    }

    public static void sortByName(ArrayList<Student> list) {
        Student tempStudent = new Student();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).getName().compareTo(list.get(j + 1).getName()) < 0) {
                    tempStudent = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tempStudent);
                }
            }
        }
    }
}
