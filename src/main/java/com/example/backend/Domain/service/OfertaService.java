package com.example.backend.Domain.service;

import com.example.backend.Domain.Entities.CentroTuristico;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OfertaService {
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public CentroTuristico createOferta(CentroTuristico centroTuristico);
    public List<CentroTuristico> findAllOferta();
    public List<CentroTuristico> findByTipo(Integer dni);
    public void  delete(Integer id);
}
