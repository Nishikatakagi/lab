/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0066;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Car {
    private String name;
    private ArrayList<String> color = new ArrayList<>();
    private ArrayList<Integer> price = new ArrayList<>();
    private ArrayList<String> day = new ArrayList<>();

    public Car() {
    }

    public Car(String name, ArrayList<String> color, ArrayList<Integer> price, ArrayList<String> day) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public ArrayList<Integer> getPrice() {
        return price;
    }

    public ArrayList<String> getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    public void setPrice(ArrayList<Integer> price) {
        this.price = price;
    }

    public void setDay(ArrayList<String> day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", price=" + price + ", day=" + day + '}';
    }
    
    
    
    //------------------------
    public void addColors(String colorInput){
        for (String c : color) {
            if(c != null && colorInput.compareToIgnoreCase(c)==0){
                System.out.println("There color have exit");
                return;
            }
        }
        color.add(colorInput);
    }
    
    public void addPrice(int priceInput){
        for (Integer p : price) {
            if(p != null && priceInput == p){
                System.out.println("There price have exit");
                return;
            }
        }
        price.add(priceInput);
    }
    
    public void addDay(String dayInput){
        for (String d : day) {
            if(d != null && dayInput.compareToIgnoreCase(d)==0){
                System.out.println("There day have exit");
                return;
            }
        }
        day.add(dayInput);
    }
    
    public boolean hasColor(String s){
        for (String s1 : this.color){
            if (s1.equalsIgnoreCase(s)){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasPrice(int x){
        for (int s1 : this.price){
            if (s1 == x){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasDay(String day){
        for (String s1 : this.day){
            if (s1.equalsIgnoreCase(day)){
                return true;
            }
        }
        return false;
    }
    
    
}
