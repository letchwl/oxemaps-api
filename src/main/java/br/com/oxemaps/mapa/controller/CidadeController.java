package br.com.oxemaps.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CidadeController {

    @GetMapping("/cidades/abreu-e-lima")
    public String abreuELima() {
        return "cidades/abreu-e-lima";
    }

}
