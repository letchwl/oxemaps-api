package br.com.oxemaps.mapa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long total;

    public Visita() {}

    public Visita(Long total) {
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
