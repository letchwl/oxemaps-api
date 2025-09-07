package br.com.oxemaps.mapa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visitantes")
public class Visitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;

    public Visitante() {}

    public Visitante(String ip) {
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
