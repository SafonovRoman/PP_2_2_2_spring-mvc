package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
        cars.add(new Car("Porsche", "Cayeenne", 2012));
        cars.add(new Car("Toyota", "CH-R", 2018));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
        return cars;
    }
}
