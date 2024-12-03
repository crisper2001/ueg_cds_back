package br.ueg.estacionamento_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ueg.estacionamento_back.models.PermanenciaModel;

public interface PermanenciaRepository extends JpaRepository<PermanenciaModel, Long> {
    
}