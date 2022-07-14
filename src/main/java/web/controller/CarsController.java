package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@Autowired
	CarService carService;

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model, @RequestParam(value = "count", defaultValue = "9223372036") Long count) {
		model.addAttribute("cars", carService.getNumberOfCars(count));
		return "cars";
	}
	
}