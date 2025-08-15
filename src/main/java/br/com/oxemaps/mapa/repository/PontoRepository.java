package br.com.oxemaps.mapa.repository;

import br.com.oxemaps.mapa.model.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
}
