package br.com.oxemaps.mapa.controller;

import br.com.oxemaps.mapa.model.Visita;
import br.com.oxemaps.mapa.model.Visitante;
import br.com.oxemaps.mapa.repository.VisitaRepository;
import br.com.oxemaps.mapa.repository.VisitanteRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HomeController {

    @Autowired
    private VisitaRepository visitaRepository;

    @Autowired
    private VisitanteRepository visitanteRepository;

    @Autowired
    private LocaleResolver localeResolver;

    private AtomicInteger visitas = new AtomicInteger(0);

    @GetMapping("/")
    public String home(
            Model model,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "lang", required = false) String lang) {

        if (lang != null) {
            localeResolver.setLocale(request, response, new Locale(lang));
        }

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
