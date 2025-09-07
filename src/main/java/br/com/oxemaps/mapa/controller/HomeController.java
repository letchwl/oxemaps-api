package br.com.oxemaps.mapa.controller;

import br.com.oxemaps.mapa.model.Visita;
import br.com.oxemaps.mapa.model.Visitante;
import br.com.oxemaps.mapa.repository.VisitaRepository;
import br.com.oxemaps.mapa.repository.VisitanteRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HomeController {

    @Autowired
    private VisitaRepository visitaRepository;

    @Autowired
    private VisitanteRepository visitanteRepository;

    private AtomicInteger visitas = new AtomicInteger(0);

    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("cidades", new String[]{"Recife", "Abreu e Lima", "Igarassu", "Itamaracá"});

        String ip = request.getRemoteAddr();

        Visita visita = visitaRepository.findById(1L).orElseGet(() -> {
            Visita nova = new Visita(0L);
            return visitaRepository.save(nova);
        });

        boolean jaVisitou = visitanteRepository.findByIp(ip).isPresent();

        if (!jaVisitou) {
            visitanteRepository.save(new Visitante(ip));
            visita.setTotal(visita.getTotal() + 1);
            visitaRepository.save(visita);
        }

        model.addAttribute("visitas", visita.getTotal());
        return "home";
    }

}
