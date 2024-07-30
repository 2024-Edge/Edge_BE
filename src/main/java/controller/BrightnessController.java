package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.BrightnessService;

@Controller
public class BrightnessController {

    private final BrightnessService brightnessService;

    @Autowired
    public BrightnessController(BrightnessService brightnessService) {
        this.brightnessService = brightnessService;
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("brightness", brightnessService.getBrightness());
        return "test";
    }

}