package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    public List<Car> getNumberOfCars(Long number) {
        List<Car> cars = carDao.getCarsList();
        return number < 5 ? cars.stream().limit(number).toList() : cars;
    }
}
