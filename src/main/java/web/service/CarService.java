package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public static List<Car> getNumberOfCars(List<Car> cars, Long number) {
        return number < 5 ? cars.stream().limit(number).toList() : cars;
    }
}
