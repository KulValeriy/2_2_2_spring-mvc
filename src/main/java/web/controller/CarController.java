package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        CarService service = new CarService();
        model.addAttribute("count", service.getCar(count));
        return "Cars";
    }

}
