package com.example.backend.Implements.repository;

import com.example.backend.Domain.Entities.TipoCentroTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoryJPA extends JpaRepository<TipoCentroTour, Integer>{

}
