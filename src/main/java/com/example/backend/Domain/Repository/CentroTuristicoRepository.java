package com.example.backend.Domain.Repository;

import com.example.backend.Domain.Entities.CentroTuristico;

import java.util.List;

public interface CentroTuristicoRepository {
    public CentroTuristico save(CentroTuristico centroTuristico);
    public List<CentroTuristico> getByTipo(Integer id);
    public CentroTuristico getbyId(Integer id);
    public List<CentroTuristico> getAll();
    public void  delete(Integer id);
}
