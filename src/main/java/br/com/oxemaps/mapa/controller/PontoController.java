package br.com.oxemaps.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PontoController {

    @GetMapping("abreu-e-lima/praca-democracia")
    public String pracaDemocracia() {
        return "pontos/praca-democracia";
    }

    @GetMapping("igarassu/camara-municipal")
    public String camaraMunicipalIgarassu() {
        return "pontos/camara-municipal-igarassu";
    }

    @GetMapping("igarassu/centro-artes")
    public String centroDeArtesIgarassu() {
        return "pontos/centro-artes-igarassu";
    }

    @GetMapping("igarassu/convento-santo-antonio")
    public String conventoSantoAntonioIgarassu() {
        return "pontos/convento-santo-antonio";
    }

    @GetMapping("igarassu/igreja-livramento")
    public String igrejaLivramentoIgarassu() {
        return "pontos/igreja-livramento";
    }

    @GetMapping("igarassu/sobrado-imperador")
    public String sobradoImperadorIgarassu() {
        return "pontos/sobrado-imperador";
    }

    @GetMapping("itamaraca/forte-orange")
    public String forteOrangeItamaraca() {
        return "pontos/forte-orange";
    }

    @GetMapping("itamaraca/embaixada-ciranda-lia")
    public String embaixadaCirandaLiaItamaraca() {
        return "pontos/embaixada-ciranda-lia";
    }

    @GetMapping("itamaraca/igreja-bom-jesus-dos-passos")
    public String igrejaBomJesusDosPassosItamaraca() {
        return "pontos/igreja-bom-jesus";
    }

    @GetMapping("itamaraca/praia-jaguaribe")
    public String praiaJaguaribeItamaraca() {
        return "pontos/praia-jaguaribe";
    }

    @GetMapping("itamaraca/pontal-jaguaribe")
    public String pontalDeJaguaribetamaraca() {
        return "pontos/pontal-jaguaribe";
    }

}
