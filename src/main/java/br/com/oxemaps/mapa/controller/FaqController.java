package br.com.oxemaps.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {

    @GetMapping("/faq")
    public String faq(Model model) {
        return "faq";
    }

}
