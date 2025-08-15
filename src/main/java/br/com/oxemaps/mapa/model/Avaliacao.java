package br.com.oxemaps.mapa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nota;
    private String comentario;
    private LocalDateTime data;
    @ManyToOne
    private Ponto ponto;

    public Avaliacao() {}

    public Avaliacao(int nota, String comentario, LocalDateTime data, Ponto ponto) {
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
        this.ponto = ponto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

}