package web.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getNumberOfCars(Long number);
}
