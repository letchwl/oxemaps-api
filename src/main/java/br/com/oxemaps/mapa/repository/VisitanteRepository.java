package br.com.oxemaps.mapa.repository;

import br.com.oxemaps.mapa.model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    Optional<Visitante> findByIp(String ip);
}

