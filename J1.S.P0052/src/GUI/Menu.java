package GUI;

import Manager.ManageGeographic;
import Manager.Validation;
import Object.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {

    public static void menu() {
        boolean check = true;
        ManageGeographic manage = new ManageGeographic();
        Country tempC = null;
        do {
            System.out.println("                            MENU       ");
            System.out.println("========================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the informaion of country by user-entered name");
            System.out.println("4. Display the information of country sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.println("========================================================");
            int choice = Validation.getInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    tempC = new Country();
                    tempC.input(manage);
                    manage.add(tempC);
                    break;
                case 2:
                    System.out.printf("%-15s%-15s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
                    tempC.display();
                    System.out.println("");
                    break;
                case 3:
                    String tempName = Validation.getString("Enter the name you want to search for: ");
                    ManageGeographic tempArray = manage.SearchCountryByName(tempName);
                    if(!tempArray.isEmpty()){
                        System.out.printf("%-15s%-15s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
                        tempArray.showAllCountry();
                    } else {
                        System.out.println("The name not exit!!!!!!");
                    }
                    break;
                case 4:
                    System.out.printf("%-15s%-15s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
                    manage.sortedByName();
                    manage.showAllCountry();
                    System.out.println("");
                    break;
                case 5:
                    check = false;
            }
        } while (check);
    }
}
