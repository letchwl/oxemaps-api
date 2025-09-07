package br.com.oxemaps.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CidadeController {

    @GetMapping("/cidades/abreu-e-lima")
    public String abreuELima() {
        return "cidades/abreu-e-lima";
    }

    @GetMapping("/cidades/igarassu")
    public String igarassu() {
        return "cidades/igarassu";
    }

    @GetMapping("/cidades/itapissuma")
    public String itapissuma() {
        return "cidades/itapissuma";
    }

    @GetMapping("/cidades/itamaraca")
    public String itamaraca() {
        return "cidades/itamaraca";
    }

}
