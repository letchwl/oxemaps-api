package br.com.oxemaps.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoConroller {

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }
}
