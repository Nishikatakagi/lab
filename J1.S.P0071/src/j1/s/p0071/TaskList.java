/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TaskList extends ArrayList<Task> {

    public void deleteByID(int ID) {
        this.remove(indexTaskFollowID(ID));
    }

    public boolean checkIDExit(int ID) {
        for (Task o : this) {
            if (o.getID() == ID) {
                return true;
            }
        }
        return false;
    }
    
    private int indexTaskFollowID(int ID){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getID() == ID) return i;
        }
        return 0;
    }

    public void showAll() {
        if (this.isEmpty()) {
            System.err.println("There are no value in dababase!");
            return;
        }
        System.out.println("------------------------------------- Task -------------------------------------");
        System.out.printf("%-4s%-10s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        for (Task thi : this) {
            thi.display();
            System.out.println("");
        }
    }
}
