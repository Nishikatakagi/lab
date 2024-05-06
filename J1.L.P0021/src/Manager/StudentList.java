/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Student;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class StudentList {

    public ArrayList<Student> list = new ArrayList<Student>();

    public void createStudent(Student s) {
        list.add(s);
    }

    public void updateStudent(Student s) {
        list.set(indexID(s.getID()), s);
    }

    public void removeStudent(String ID) {
        list.remove(indexID(ID));
    }

    public ArrayList<Student> findByName(String text) {
        /// Tạo mảng arrFind để lưu trữ những sinh viên tìm thấy
        ArrayList<Student> arrFind = new ArrayList<>();

        char firstText = text.charAt(0);

        // Lặp qua từng sinh viên trong mảng students thay vì arrFind
        for (Student student : list) {
            String studentName = student.getName();
            // Lặp qua từng vị trí trong tên sinh viên
            for (int i = 0; i <= studentName.length() - text.length(); i++) {
                // Nếu ký tự đầu của text trùng với ký tự tại vị trí i
                if (firstText == studentName.charAt(i)) {
                    // So sánh với phần tên dưới tên i có độ dài bằng text
                    if (text.equalsIgnoreCase(studentName.substring(i, i + text.length()))) {
                        // Nếu trùng, thêm sinh viên vào danh sách arrFind
                        arrFind.add(student);
                    }
                }
            }
        }

        return arrFind;
    }

    public void sortByName() {
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

    public int indexID(String tempCode) {
        for (int i = 0; i < list.size(); i++) {
            if (tempCode.equalsIgnoreCase(list.get(i).getID())) {
                return i;
            }
        }
        return 0;
    }

    public void report() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    public boolean checkExits(String tempCode) {
        for (int i = 0; i < list.size(); i++) {
            if (tempCode.equalsIgnoreCase(list.get(i).getID())) {
                return true;
            }
        }
        return false;
    }
}
