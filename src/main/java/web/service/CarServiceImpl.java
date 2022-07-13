package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    public List<Car> getNumberOfCars(Long number) {
        CarDao carDao = new CarDaoImpl();
        List<Car> cars = carDao.getCarsList();
        return number < 5 ? cars.stream().limit(number).toList() : cars;
    }
}
