package br.com.oxemaps.mapa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ponto_historico")
public class Ponto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private int anoFundacao;
    private Double latitude;
    private Double longitude;
    private Cidade cidade;
    private Categoria categoria;
    private String linkVideo;
    @OneToMany
    private List<Avaliacao> comentarios;

    public Ponto() {}

    public Ponto(String nome, String descricao, int anoFundacao, Double latitude, Double longitude, Cidade cidade, Categoria categoria, String linkVideo) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoFundacao = anoFundacao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cidade = cidade;
        this.categoria = categoria;
        this.linkVideo = linkVideo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

}