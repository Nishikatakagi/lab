/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0066;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class J1SP0066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        Car AUDI = new Car();
        Car MERCEDES = new Car();
        Car BMW = new Car();

        AUDI.setName("AUDI");
        AUDI.addColors("WHITE");
        AUDI.addColors("Yellow");
        AUDI.addColors("ORANGE");
        AUDI.addPrice(5500);
        AUDI.addPrice(3000);
        AUDI.addPrice(4500);
        AUDI.addDay("FRIDAY");
        AUDI.addDay("SUNDAY");
        AUDI.addDay("MONDAY");

        MERCEDES.setName("MERCEDES");
        MERCEDES.addColors("GREEN");
        MERCEDES.addColors("BLUE");
        MERCEDES.addColors("PURPLE");
        MERCEDES.addPrice(5000);
        MERCEDES.addPrice(6000);
        MERCEDES.addPrice(8500);
        MERCEDES.addDay("TUESDAY");
        MERCEDES.addDay("SATURDAY");
        MERCEDES.addDay("WEDNESDAY");

        BMW.setName("BMW");
        BMW.addColors("PINK");
        BMW.addColors("RED");
        BMW.addColors("BROWN");
        BMW.addPrice(2500);
        BMW.addPrice(3500);
        BMW.addPrice(3000);
        BMW.addDay("MONDAY");
        BMW.addDay("SUNDAY");
        BMW.addDay("THURSDAY");

        Showroom sr = new Showroom();
        sr.add(AUDI);
        sr.add(MERCEDES);
        sr.add(BMW);

        String choice;
        boolean check = true;

        System.out.println("====== Showroom car program =====");
        while (check) {
            System.out.println("Input Information of Car");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Color: ");
            String color = sc.nextLine();
            System.out.print("Price: ");
            int price;
            try {
                price = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Can't sell Car");
                System.out.println("Price is digit");
                continue;
            }

            System.out.print("Today: ");
            String day = sc.nextLine();
            Car temp = sr.searchCar(name, color, price, day);
            System.out.println("Do you want find more? (Y/N)");
            String conti = sc.nextLine();
            if (conti.equalsIgnoreCase("N")) {
                check = false;

            }
        }
    }

}
