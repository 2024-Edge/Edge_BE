package controller;

import service.HumidityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HumidityController {

    private final HumidityService humidityService;

    @Autowired
    public HumidityController(HumidityService humidityService) {
        this.humidityService = humidityService;
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("temperature", humidityService.getTemperature());
        model.addAttribute("humidity", humidityService.getHumidity());
        return "test";
    }

}