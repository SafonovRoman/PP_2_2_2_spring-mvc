package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
        cars.add(new Car("Porsche", "Cayeenne", 2012));
        cars.add(new Car("Toyota", "CH-R", 2018));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
        cars.add(new Car("Nissan", "Almera", 2000));
        cars.add(new Car("Nissan", "Juke", 2011));
    }

    @Override
    public List<Car> getCarsList() {
        return cars;
    }
}
