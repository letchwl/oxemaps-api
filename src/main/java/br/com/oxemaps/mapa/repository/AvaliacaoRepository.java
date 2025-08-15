package br.com.oxemaps.mapa.repository;

import br.com.oxemaps.mapa.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
