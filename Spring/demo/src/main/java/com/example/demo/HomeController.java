
package com.example.demo;

import com.example.demo.service.EjercicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final EjercicioService ejercicioService;

    public HomeController(EjercicioService ejercicioService) {
        this.ejercicioService = ejercicioService;
    }

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/ejercicio1")
    public String ejercicio1(Model model) {
        String resultado = ejercicioService.ejercicio1();

        model.addAttribute("resultado", resultado);

        return "ejercicio1";
    }
}