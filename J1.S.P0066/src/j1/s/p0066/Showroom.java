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
public class Showroom extends ArrayList<Car> {

    public Car searchCar(String name, String color, int price, String day) {
        Car findCar = null;
        for (Car car : this) {
            if (!car.getName().equalsIgnoreCase(name)) {
                continue;
            }
            if (!color.equalsIgnoreCase("no color") && !car.hasColor(color)) {
                continue;
            }
            if (!car.hasPrice(price)) {
                continue;
            }
            if (!car.hasDay(day)) {
                continue;
            }
            findCar = car;
            System.out.println("Sell Car");
            return findCar;
        }

        // kiểm tra xem có tìm được xe trong list không, nếu k có thì tìm xem lỗi là gì
        if (findCar == null) {
            System.out.println("Can't sell Car");
            if (price < 0) {
                System.out.println("Price greater than zero");
            }
            boolean checkName = false;
            // kiem tra ten truoc, neu ten k ton tại thi dừng lại
            // nếu tên có tồn tại thì tìm các thuộc tính còn lại của tên đó
            Car temp = new Car();
            for (Car car : this) {
                if (car.getName().equalsIgnoreCase(name)) {
                    temp = car;
                    checkName = true;
                    break;
                }
            }
            if (!checkName) {
                System.out.println("Car break");
            }
            if (!(temp.hasColor(color) || color.equalsIgnoreCase("no color"))) {
                System.out.println("Color Car does not exist");
            }
            if (!temp.hasPrice(price)) {
                System.out.println("Price not exit");
            }
            if (!temp.hasDay(day)) {
                System.out.println("Car can't sell today");
            }
        }return null;
    }

}
