package com.example.backend.Implements.repository.ImpJPA;

import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.Repository.TipoCentroTourRepository;
import com.example.backend.Implements.repository.UsuarioRepositoryJPA;
import com.example.backend.controller.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoCentroTourRepositoryJPAImp implements TipoCentroTourRepository {

    private final UsuarioRepositoryJPA db;

    public TipoCentroTourRepositoryJPAImp(UsuarioRepositoryJPA db) {
        this.db = db;
    }
    @Override
    public TipoCentroTour save(TipoCentroTour tipoCentroTour) {
        return db.save(tipoCentroTour);
    }
    @Override
    public TipoCentroTour getbyId(Integer id) {
        return db.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No Existe el contrTour: "+id));
    }
    @Override
    public void delete(Integer id) {
        db.deleteById(id);
    }

    @Override
    public List<TipoCentroTour> getAll() {
        return db.findAll();
    }
}
