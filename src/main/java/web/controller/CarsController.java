package web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")        // Все запросы /cars попадут сюда
public class CarsController {

    private final CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()       // Запросы совпадают, можно не писать внутри ничего
    // в RequestParam count -- тот параметр, который мы передадим в запросе
    // Значение по умолчанию -- 5 (для корректного отображения при отсутствии параметров)
    public String getCars(@RequestParam(value = "count", defaultValue = "5") Integer count,
                          Model model) {

        model.addAttribute("cars", carDAO.getCars(count));
        return "car/cars";
    }
}
