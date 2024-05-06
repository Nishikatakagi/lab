/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Manager.Validation;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Student {
    private String ID;
    private String Name;
    private String semester;
    private String CourseName;

    public Student() {
    }

    public Student(String ID, String Name, String semester, String CourseName) {
        this.ID = ID;
        this.Name = Name;
        this.semester = semester;
        this.CourseName = CourseName;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", semester=" + semester + ", CourseName=" + CourseName + '}';
    }
    
    public void input(ArrayList<Student> ls){
        setID(Validation.getID("Enter the code: ", ls));
        setName(Validation.getString("Enter the name student: "));
        setCourseName(Validation.getString("Enter the course name: "));
        setSemester(Validation.getString("Enter semester: "));
    }
    
    public void inputToUpdate(ArrayList<Student> ls, String ID){
        setID(ID);
        setName(Validation.getString("Enter the name student: "));
        setCourseName(Validation.getString("Enter the course name: "));
        setSemester(Validation.getString("Enter semester: "));
    }
}
