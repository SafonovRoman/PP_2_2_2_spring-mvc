package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model, @RequestParam(value = "count", defaultValue = "9223372036") Long count) {
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
		cars = CarService.getNumberOfCars(cars, count);
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}