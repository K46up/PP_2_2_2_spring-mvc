package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping
    public String printListCar(Model model) {
        model.addAttribute("cars", carServiceImpl.getCars());
        return "cars";
    }

    @GetMapping(value = "/cars?count={count}")
    public String printListCarForCount(@PathVariable("count") int count, Model model) {
        model.addAttribute("cars", carServiceImpl.getListCarForCount(count));
        return "cars";
    }
}
