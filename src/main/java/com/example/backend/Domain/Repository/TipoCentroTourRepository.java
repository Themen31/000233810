package com.example.backend.Domain.Repository;

import com.example.backend.Domain.Entities.TipoCentroTour;

import java.util.List;

public interface TipoCentroTourRepository {
    public TipoCentroTour save(TipoCentroTour tipoCentroTour);
    public TipoCentroTour getbyId(Integer id);
    public void  delete(Integer id);
    public List<TipoCentroTour> getAll();
}
