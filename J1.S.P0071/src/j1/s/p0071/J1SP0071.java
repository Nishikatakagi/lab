/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

/**
 *
 * @author user
 */
public class J1SP0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.setPlanFrom(636);
        
        TaskList list = new TaskList();
        boolean check = true;
        String choice = null;
        int ID = 1;
        while (check) {            
            showMenu();
            choice = Validation.inputString("Enter your choice: ");
            switch(choice){
                case "1":
                    Task t = new Task();
                    t.setID(ID);
                    ID++;
                    t.input();
                    list.add(t);
                    break;
                case "2":
                    System.out.println("------------- Del task -------------");
                    System.out.print("ID: ");
                    int tempID = Integer.parseInt(Validation.sc.nextLine());
                    if(list.checkIDExit(tempID)){
                        list.deleteByID(tempID);
                        System.out.println("DELETE SUCESSFULL!");
                    }else{
                        System.err.println("ID not exit in database");
                    }
                    break;
                case "3":
                    list.showAll();
                    break;
                case "4":
                    check = false;
                    break;
                    default:
                        System.err.println("Value not valid!!! Enter number from 1-4");
            }
            
        }
    }
    
    private static void showMenu(){
        System.out.println("======= Task program =======");
        System.out.println("1. Add task");
        System.out.println("2. Delete task");
        System.out.println("3. Display task");
        System.out.println("4. Exit");
    }
    
}
